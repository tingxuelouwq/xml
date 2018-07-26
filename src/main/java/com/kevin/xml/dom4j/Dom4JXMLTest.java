package com.kevin.xml.dom4j;

import junit.framework.TestCase;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.io.InputStream;

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
        Element stu = (Element) root.elements("学生").get(0);
        System.out.println("sex: " + stu.attributeValue("sex"));
        Element name = stu.element("名字");
        System.out.println("name: " + name.getText());

        Element stu2 =
                (Element) document.selectSingleNode("/班级/学生[1]");
        Element name2 = stu2.element("名字");
        System.out.println("name: " + name2.getText());
    }

    public void testAdd() {
        Element newStu = DocumentHelper.createElement("学生");
    }
}
