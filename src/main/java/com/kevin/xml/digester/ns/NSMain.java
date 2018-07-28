package com.kevin.xml.digester.ns;

import org.apache.commons.digester3.Digester;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

/**
 * @类名: NSMain
 * @包名：com.kevin.xml.digester.ns
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/28 16:29
 * @版本：1.0
 * @描述：
 */
public class NSMain {

    public static void main(String[] args) throws IOException, SAXException {
        Digester digester = new Digester();
        digester.setValidating(false);
        digester.setNamespaceAware(true);
        digester.setRuleNamespaceURI("http://www.mycompany.com/MyNamespace");

        digester.addObjectCreate("foo", Foo.class);
        digester.addSetProperties("foo");
        digester.addObjectCreate("foo/bar", Bar.class);
        digester.addSetProperties("foo/bar");
        digester.addSetNext("foo/bar", "addBar", Bar.class.getName());

        Foo foo = digester.parse(NSMain.class.getClassLoader().getResourceAsStream("ns.xml"));
        System.out.println(foo.getName());
        List<Bar> barList = foo.getBarList();
        for (Bar bar : barList) {
            System.out.println(bar.getId() + "," + bar.getTitle());
        }
    }
}
