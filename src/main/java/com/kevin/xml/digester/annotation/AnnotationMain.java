package com.kevin.xml.digester.annotation;

import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.annotations.FromAnnotationsRuleModule;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @类名: AnnotationMain
 * @包名：com.kevin.xml.digester.annotation
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 16:39
 * @版本：1.0
 * @描述：
 */
public class AnnotationMain {

    public static void main(String[] args) throws IOException, SAXException {
        DigesterLoader loader = DigesterLoader.newLoader(new FromAnnotationsRuleModule() {
            @Override
            protected void configureRules() {
                bindRulesFrom(Channel.class);
            }
        });
        Digester digester = loader.newDigester();
        Channel channel = digester.parse(AnnotationMain.class.getClassLoader()
                .getResourceAsStream("channel.xml"));
        System.out.println(channel);
    }
}
