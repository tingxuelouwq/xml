package com.kevin.xml.digester.rule.constructor;

import com.kevin.xml.digester.rule.Employee;
import com.kevin.xml.digester.rule.MyBean;
import com.kevin.xml.digester.rule.variable.EmployeeSubstitutionMain;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.ObjectCreateRule;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @类名: ConstructorParamMain
 * @包名：com.kevin.xml.digester.rule.constructor
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 15:01
 * @版本：1.0
 * @描述：
 */
public class ConstructorParamMain {

    public static void main(String[] args) throws IOException, SAXException {
        ObjectCreateRule createRule = new ObjectCreateRule(MyBean.class);
        createRule.setConstructorArgumentTypes(Boolean.class, Float.class);

        Digester digester = new Digester();
        digester.addRule("root/bean", createRule);
        digester.addCallParam("root/bean", 0, "super");
        digester.addCallParam("root/bean/rate", 1);

        MyBean myBean = digester.parse(ConstructorParamMain.class.getClassLoader()
                .getResourceAsStream("constructor-params.xml"));
        System.out.println(myBean);
    }
}
