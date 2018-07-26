package com.kevin.xml.dom;

import junit.framework.TestCase;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @类名: DOMXMLTest
 * @包名：com.kevin.xml.dom
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/26 18:24
 * @版本：1.0
 * @描述：
 */
public class DOMXMLTest extends TestCase {

    public void testDOMXML() {

    }

    private void readXML(File file) throws ParserConfigurationException, IOException, SAXException {
        // 1. 创建DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 2. 创建DocumentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();
        // 3. 解析XML文件并获取Document对象
        Document document = builder.parse(file);
        // 4.
    }
}
