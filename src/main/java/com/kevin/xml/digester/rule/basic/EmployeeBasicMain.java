package com.kevin.xml.digester.rule.basic;

import com.kevin.xml.digester.rule.Address;
import com.kevin.xml.digester.rule.Employee;
import org.apache.commons.digester3.Digester;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @类名: EmployeeBasicMain
 * @包名：com.kevin.xml.digester.rule
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 9:37
 * @版本：1.0
 * @描述：
 */
public class EmployeeBasicMain {

    public static void main(String[] args) throws IOException, SAXException {
        Digester digester = new Digester();
        digester.setValidating(false);

        digester.addObjectCreate("employee", Employee.class);
        digester.addCallMethod("employee/firstName", "setFirstName", 0);
        digester.addCallMethod("employee/lastName", "setLastName", 0);

        digester.addObjectCreate("employee/address", Address.class);
        digester.addCallMethod("employee/address/type", "setType", 0);
        digester.addCallMethod("employee/address/city", "setCity", 0);
        digester.addCallMethod("employee/address/state", "setState", 0);
        digester.addSetNext("employee/address", "setAddress");

        Employee employee = digester.parse(EmployeeBasicMain.class.getClassLoader()
                .getResourceAsStream("employee.xml"));
        System.out.println(employee);
    }
}
