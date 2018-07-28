package com.kevin.xml.sax.worker;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @类名: WorkerHandler
 * @包名：com.kevin.xml.sax
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/26 16:36
 * @版本：1.0
 * @描述：
 */
public class WorkerHandler extends DefaultHandler {

    /**
     * 开始解析文档时调用
     * @throws SAXException
     */
    @Override
    public void startDocument () throws SAXException {
        // no op
    }

    /**
     * 文档解析结束时调用
     * @throws SAXException
     */
    @Override
    public void endDocument () throws SAXException {
        // no op
    }

    /**
     * 开始解析一个子标签时调用
     * @param uri           xml文档的命名空间
     * @param localName     子标签的名称
     * @param qName         子标签的名称（带命名空间）
     * @param attributes    子标签的属性集
     * @throws SAXException
     */
    @Override
    public void startElement (String uri, String localName,
                              String qName, Attributes attributes)
            throws SAXException {
        System.out.print("<" + qName);
        int len = attributes.getLength();
        for (int i = 0; i < len; i++) {
            String attrName = attributes.getQName(i);
            String attrValue = attributes.getValue(i);
            System.out.print(" " + attrName + "=\"" + attrValue + "\"");
        }
        System.out.print(">");
    }

    /**
     * 解析一个子标签结束时调用
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException
     */
    @Override
    public void endElement (String uri, String localName, String qName)
            throws SAXException {
        System.out.print("</" + qName + ">");
    }

    /**
     * 解析文本节点时调用
     * @param ch        当前读取到的文本节点的字符数组
     * @param start     字符数组的起始位置
     * @param length    字符数组的长度
     * @throws SAXException
     */
    @Override
    public void characters (char ch[], int start, int length)
            throws SAXException {
        System.out.print(new String(ch, start, length));
    }
}
