package com.kevin.xml.digester.basic;

import org.apache.commons.digester3.Digester;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @类名: WebMain
 * @包名：com.kevin.xml.digester
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/28 15:15
 * @版本：1.0
 * @描述：
 */
public class WebMain {

    public static void main(String[] args) throws IOException, SAXException {
        // 1. 创建Digester对象实例
        Digester digester = new Digester();
        // 2. 配置Digester属性值
        digester.setValidating(false);
        // 3. 设置匹配模式和规则
        digester.addObjectCreate("web-app/servlet", ServeltBean.class);
        digester.addCallMethod("web-app/servlet/servlet-name", "setServletName", 0);
        digester.addCallMethod("web-app/servlet/servlet-class", "setServletClass", 0);
        digester.addCallMethod("web-app/servlet/init-param", "addInitParam", 2);
        digester.addCallParam("web-app/servlet/init-param/param-name", 0);
        digester.addCallParam("web-app/servlet/init-param/param-value", 1);
        // 4. 开始解析
        ServeltBean serveltBean = digester.parse(WebMain.class.getClassLoader().getResourceAsStream("web.xml"));
        // 5. 打印解析结果
        System.out.println(serveltBean);
    }
}
