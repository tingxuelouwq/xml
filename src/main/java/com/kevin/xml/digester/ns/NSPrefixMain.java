package com.kevin.xml.digester.ns;

import org.apache.commons.digester3.Digester;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

/**
 * @类名: NSPrefixMain
 * @包名：com.kevin.xml.digester.ns
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 9:14
 * @版本：1.0
 * @描述：
 */
public class NSPrefixMain {

    public static void main(String[] args) throws IOException, SAXException {
        Digester digester = new Digester();
        digester.setValidating(false);
        digester.setNamespaceAware(false);

        digester.addObjectCreate("m:foo", Foo.class);
        digester.addSetProperties("m:foo");
        digester.addObjectCreate("m:foo/m:bar", Bar.class);
        digester.addSetProperties("m:foo/m:bar");
        digester.addSetNext("m:foo/m:bar", "addBar", Bar.class.getName());

        digester.addObjectCreate("m:foo/y:bar", Bar.class);
        digester.addSetProperties("m:foo/y:bar");
        digester.addSetNext("m:foo/y:bar", "addBar", Bar.class.getName());

        Foo foo = digester.parse(NSMain.class.getClassLoader().getResourceAsStream("ns.xml"));
        System.out.println(foo.getName());
        List<Bar> barList = foo.getBarList();
        for (Bar bar : barList) {
            System.out.println(bar.getId() + "," + bar.getTitle());
        }
    }
}
