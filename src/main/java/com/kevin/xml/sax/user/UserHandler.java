package com.kevin.xml.sax.user;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @类名: UserHandler
 * @包名：com.kevin.xml.sax.user
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/28 14:59
 * @版本：1.0
 * @描述：
 */
public class UserHandler extends DefaultHandler {

    private List<User> users;
    private User user;          // 记录当前User
    private String currentTag;  // 记录当前解析到的标签名称

    @Override
    public void startDocument () throws SAXException {
        users = new ArrayList<User>();
    }

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        if ("user".equals(qName)) {
            int len = attributes.getLength();
            for (int i = 0; i < len; i++) {
                user = new User();
                if ("id".equals(attributes.getLocalName(i))) {
                    user.setId(Long.parseLong(attributes.getValue(i)));
                }
            }
        }
        currentTag = qName;
    }

    @Override
    public void characters(char[] ch, int start, int lenght) throws SAXException {
        String value = new String(ch, start, lenght);
        if ("name".equals(currentTag)) {
            user.setName(value);
        } else if ("password".equals(currentTag)) {
            user.setPassword(value);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("user".equals(qName)) {
            users.add(user);
            user = null;
        }
        currentTag = null;
    }

    @Override
    public void endDocument() throws SAXException {
        // do nothing
    }

    public List<User> getUsers() {
        return users;
    }
}
