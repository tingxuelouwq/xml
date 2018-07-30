package com.kevin.xml.digester.rule.variable;

import com.kevin.xml.digester.rule.Employee;
import com.kevin.xml.digester.rule.rulemodule.EmployeeModule;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.Substitutor;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.substitution.MultiVariableExpander;
import org.apache.commons.digester3.substitution.VariableSubstitutor;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @类名: EmployeeSubstitutionMain
 * @包名：com.kevin.xml.digester.rule.variable
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 14:48
 * @版本：1.0
 * @描述：
 */
public class EmployeeSubstitutionMain {

    private static final DigesterLoader LOADER = DigesterLoader.newLoader(new EmployeeModule())
            .setValidating(false);

    public static void main(String[] args) throws IOException, SAXException {
        // set up the variables the input xml can reference
        Map<String, Object> vars = new HashMap<>();
        vars.put("user.name", "me");
        vars.put("type", "boss");

        // map ${varname} to the entries in the var map
        MultiVariableExpander expander = new MultiVariableExpander();
        expander.addSource("$", vars);

        // allow expansions in both attributes and body text
        Substitutor substitutor = new VariableSubstitutor(expander);

        Digester digester = LOADER.newDigester();
        digester.setSubstitutor(substitutor);
        Employee employee = digester.parse(EmployeeSubstitutionMain.class.getClassLoader()
                .getResourceAsStream("employee$.xml"));
        System.out.println(employee);
    }
}
