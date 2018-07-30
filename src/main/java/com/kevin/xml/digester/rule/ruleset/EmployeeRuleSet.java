package com.kevin.xml.digester.rule.ruleset;

import com.kevin.xml.digester.rule.Address;
import com.kevin.xml.digester.rule.Employee;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.RuleSet;

/**
 * @类名: EmployeeRuleSet
 * @包名：com.kevin.xml.digester.rule
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 9:49
 * @版本：1.0
 * @描述：
 */
public class EmployeeRuleSet implements RuleSet {
    @Override
    public String getNamespaceURI() {
        return null;
    }

    @Override
    public void addRuleInstances(Digester digester) {
        digester.addObjectCreate("employee", Employee.class);
        digester.addCallMethod("employee/firstName", "setFirstName", 0);
        digester.addCallMethod("employee/lastName", "setLastName", 0);

        digester.addObjectCreate("employee/address", Address.class);
        digester.addCallMethod("employee/address/type", "setType", 0);
        digester.addCallMethod("employee/address/city", "setCity", 0);
        digester.addCallMethod("employee/address/state", "setState", 0);
        digester.addSetNext("employee/address", "setAddress");
    }
}
