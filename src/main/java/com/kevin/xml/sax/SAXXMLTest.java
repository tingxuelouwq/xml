package com.kevin.xml.sax;

import junit.framework.TestCase;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * @类名: SAXXMLTest
 * @包名：com.kevin.xml.sax
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/26 16:48
 * @版本：1.0
 * @描述：
 */
public class SAXXMLTest extends TestCase {

    public void testSAX() throws ParserConfigurationException, SAXException, IOException {
        // 1. 获取XML输入流
        InputStream is = SAXXMLTest.class.getClassLoader().getResourceAsStream("worker.xml");
        // 2. 创建SAX解析器工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        // 3. 创建SAX解析器
        SAXParser parser = factory.newSAXParser();
        // 4. 创建SAX事件处理器
        WorkerHandler handler = new WorkerHandler();
        // 5. 开始解析xml文件
        parser.parse(is, handler);
    }
}
