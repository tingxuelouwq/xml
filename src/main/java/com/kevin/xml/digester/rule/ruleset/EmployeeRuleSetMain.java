package com.kevin.xml.digester.rule.ruleset;

import com.kevin.xml.digester.rule.Employee;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.RuleSet;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @类名: EmployeeRuleSetMain
 * @包名：com.kevin.xml.digester.rule
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 9:50
 * @版本：1.0
 * @描述：
 */
public class EmployeeRuleSetMain {

    private static final RuleSet RULE_SET = new EmployeeRuleSet();

    public static void main(String[] args) throws IOException, SAXException {
        Digester digester = new Digester();
        digester.setValidating(false);
        digester.addRuleSet(RULE_SET);
        Employee employee = digester.parse(EmployeeRuleSetMain.class.getClassLoader()
                .getResourceAsStream("employee.xml"));
        System.out.println(employee);
    }
}
