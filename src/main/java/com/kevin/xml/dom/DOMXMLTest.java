package com.kevin.xml.dom;

import junit.framework.TestCase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.InputStream;

/**
 * @类名: DOMXMLTest
 * @包名：com.kevin.xml.dom
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/26 18:24
 * @版本：1.0
 * @描述：
 */
public class DOMXMLTest extends TestCase {

    private Document document;

    @Override
    public void setUp() throws ParserConfigurationException, IOException, SAXException {
        // 1. 创建DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 2. 创建DocumentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();
        // 3. 指定要解析的XML文件
        InputStream is = DOMXMLTest.class.getClassLoader().getResourceAsStream("class.xml");
        // 4. 解析XML文件并获取Document对象
        document = builder.parse(is);
    }

    public void testReadFirstStudent() {
        NodeList students = document.getElementsByTagName("学生");
        Element firstStudent = (Element) students.item(0);
        System.out.println("sex: " + firstStudent.getAttribute("sex"));
        NodeList names = firstStudent.getElementsByTagName("名字");
        Element name = (Element) names.item(0);
        System.out.println("name: " + name.getTextContent());
    }

    public void testUpdate() throws TransformerException {
        NodeList students = document.getElementsByTagName("学生");
        Element firstStudent = (Element) students.item(0);
        NodeList names = firstStudent.getElementsByTagName("名字");
        Element name = (Element) names.item(0);
        name.setTextContent("宋江");
        transformDocument();
    }

    public void testDelete() throws TransformerException {
        Element firstStudent =
                (Element) document.getElementsByTagName("学生").item(0);
//        firstStudent.getParentNode().removeChild(firstStudent);
        firstStudent.removeAttribute("sex");
        transformDocument();
    }

    public void testAdd() throws TransformerException {
        Element newStudent = document.createElement("学生");
        newStudent.setAttribute("sex", "男");
        Element name = document.createElement("名字");
        name.setTextContent("小明");
        Element age = document.createElement("年龄");
        age.setTextContent("22");
        Element info = document.createElement("介绍");
        info.setTextContent("好学生一枚");
        newStudent.appendChild(name);
        newStudent.appendChild(age);
        newStudent.appendChild(info);
        document.getDocumentElement().appendChild(newStudent);
        transformDocument();
    }

    private void transformDocument() throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.transform(new DOMSource(document),
                new StreamResult("src/class.xml"));
    }
}
