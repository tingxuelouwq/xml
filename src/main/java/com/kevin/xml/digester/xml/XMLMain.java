package com.kevin.xml.digester.xml;

import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.xmlrules.FromXmlRulesModule;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @类名: XMLMain
 * @包名：com.kevin.xml.digester.annotation
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 16:00
 * @版本：1.0
 * @描述：
 */
public class XMLMain {

    public static void main(String[] args) throws IOException, SAXException {
        DigesterLoader loader = DigesterLoader.newLoader(new FromXmlRulesModule() {
            @Override
            protected void loadRules() {
                loadXMLRules(XMLMain.class.getClassLoader().getResourceAsStream("rule.xml"));
            }
        });
        Digester digester = loader.newDigester();
        ChartRegistry chartRegistry = digester.parse(XMLMain.class.getClassLoader()
                .getResourceAsStream("charts.xml"));
        System.out.println(chartRegistry);
    }
}
