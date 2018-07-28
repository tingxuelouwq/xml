package com.kevin.xml.sax.user;

import junit.framework.TestCase;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @类名: UserTest
 * @包名：com.kevin.xml.sax.user
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/28 15:06
 * @版本：1.0
 * @描述：
 */
public class UserSAXTest extends TestCase {

    public void testUserSAX() throws ParserConfigurationException, SAXException, IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("user.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        UserHandler handler = new UserHandler();
        parser.parse(is, handler);
        is.close();
        List<User> users = handler.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
