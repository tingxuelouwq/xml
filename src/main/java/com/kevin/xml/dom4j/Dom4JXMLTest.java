package com.kevin.xml.dom4j;

import junit.framework.TestCase;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.List;

/**
 * @类名: Dom4JXMLTest
 * @包名：com.kevin.xml.dom4j
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/26 22:35
 * @版本：1.0
 * @描述：
 */
public class Dom4JXMLTest extends TestCase {

    private Document document;

    @Override
    public void setUp() throws DocumentException {
        // 1.创建解析器
        SAXReader reader = new SAXReader();
        // 2. 指定要解析的xml文件
        InputStream is = this.getClass().getClassLoader()
                .getResourceAsStream("class.xml");
        // 3. 创建Document
        document = reader.read(is);
    }

    public void testRead() {
        Element root = document.getRootElement();
        System.out.println("root: " + root.getName());
        Element stu = (Element) root.elements("学生").get(0);
        System.out.println("sex: " + stu.attributeValue("sex"));
        Element name = stu.element("名字");
        System.out.println("name: " + name.getText());
    }

    public void testAdd() throws IOException {
        Element newStu = DocumentHelper.createElement("学生");
        newStu.addAttribute("别名", "及时雨");
        Element name = DocumentHelper.createElement("名字");
        name.setText("宋江");
        Element age = DocumentHelper.createElement("年龄");
        age.setText("45");
        Element info = DocumentHelper.createElement("介绍");
        info.setText("好汉一条");
        newStu.add(name);
        newStu.add(age);
        newStu.add(info);
        document.getRootElement().add(newStu);
        transform();
    }

    public void testDelete() throws IOException {
        Element stu1 = document.getRootElement().element("学生");
        stu1.getParent().remove(stu1);
        transform();
    }

    public void testUpdate() throws IOException {
        List<Element> stus = document.getRootElement().elements("学生");
        for (Element stu : stus) {
            Element age = stu.element("年龄");
            age.setText(Integer.parseInt(age.getText()) + 3 + "");
            Element name = stu.element("名字");
            name.addAttribute("别名", "hello java");
        }
        transform();
    }

    public void testConvert() throws IOException, DocumentException {
        // 字符串转xml文档
        String text = "<班级><学生 学号='2012115103'><姓名>林冲</姓名><性别>男</性别></学生></班级>";
        document = DocumentHelper.parseText(text);
        transform();

        // xml文档转字符串
        String xml = document.asXML();
        System.out.println(xml);

        Element root = document.getRootElement();
        String rootXml = root.asXML();
        System.out.println(rootXml);

        Element stu1 = root.element("学生");
        String stu1Xml = stu1.asXML();
        System.out.println(stu1Xml);
    }

    private void transform() throws IOException {
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter(new FileOutputStream(
                new File("src/dom4j.xml")), outputFormat);
        writer.write(document);
        writer.close();
    }
}
