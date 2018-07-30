package com.kevin.xml.digester.rule.rulemodule;

import com.kevin.xml.digester.rule.Address;
import com.kevin.xml.digester.rule.Employee;
import org.apache.commons.digester3.binder.AbstractRulesModule;

/**
 * @类名: EmployeeModule
 * @包名：com.kevin.xml.digester.rule
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 9:53
 * @版本：1.0
 * @描述：
 */
public class EmployeeModule extends AbstractRulesModule {
    @Override
    protected void configure() {
        forPattern("employee").createObject().ofType(Employee.class);
        forPattern("employee/firstName").setBeanProperty();
        forPattern("employee/lastName").setBeanProperty();

        forPattern("employee/address").createObject().ofType(Address.class)
                .then().setNext("setAddress");
        forPattern("employee/address/type").setBeanProperty();
        forPattern("employee/address/city").setBeanProperty();
        forPattern("employee/address/state").setBeanProperty();
    }
}
