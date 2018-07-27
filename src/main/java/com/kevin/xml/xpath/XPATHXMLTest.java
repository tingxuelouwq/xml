package com.kevin.xml.xpath;

import junit.framework.TestCase;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @类名: XPATHXMLTest
 * @包名：com.kevin.xml.xpath
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/27 17:04
 * @版本：1.0
 * @描述：
 */
public class XPATHXMLTest extends TestCase {

    private Document document;

    @Override
    public void setUp() throws DocumentException {
        // 1.创建解析器
        SAXReader reader = new SAXReader();
        // 2. 指定要解析的xml文件
        InputStream is = this.getClass().getClassLoader()
                .getResourceAsStream("bookstore.xml");
        // 3. 创建Document
        document = reader.read(is);
    }

    public void testRead() {
        // 选取bookstore元素
        Node root = document.selectSingleNode("/bookstore");
        System.out.println(root.getName());
        // 选取bookstore下的所有book元素
        List books = document.selectNodes("bookstore/book");
        System.out.println(books.size());
        // 选取名为lang的所有属性
        List langs = document.selectNodes("//@lang");
        System.out.println(langs.size());
        // 选取bookstore下的第二个book元素
        Node book2 = document.selectSingleNode("bookstore/book[2]");
        System.out.println(book2.asXML());
        // 选取bookstore元素中的book元素的title元素，且price元素要大于35.00
        List titles = document.selectNodes("bookstore/book[price>35.00]/title");
        System.out.println(titles.size());
    }
}
