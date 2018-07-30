package com.kevin.xml.digester.rule.rulemodule;

import com.kevin.xml.digester.rule.Employee;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @类名: EmployeeModuleMain
 * @包名：com.kevin.xml.digester.rule
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 10:17
 * @版本：1.0
 * @描述：
 */
public class EmployeeModuleMain {

    private static final  DigesterLoader LOADER = DigesterLoader.newLoader(new EmployeeModule())
            .setValidating(false);

    public static void main(String[] args) throws IOException, SAXException {
        Digester digester = LOADER.newDigester();
        Employee employee = digester.parse(EmployeeModuleMain.class.getClassLoader()
                .getResourceAsStream("employee.xml"));
        System.out.println(employee);
    }
}
