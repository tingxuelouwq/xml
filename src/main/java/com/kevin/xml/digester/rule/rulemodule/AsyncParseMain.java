package com.kevin.xml.digester.rule.rulemodule;

import com.kevin.xml.digester.rule.Employee;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @类名: AsyncParseMain
 * @包名：com.kevin.xml.digester.rule.ruleset
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 11:06
 * @版本：1.0
 * @描述：
 */
public class AsyncParseMain {

    private static final DigesterLoader LOADER = DigesterLoader.newLoader(new EmployeeModule())
            .setValidating(false)
            .setExecutorService(Executors.newSingleThreadExecutor());

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Digester digester = LOADER.newDigester();
        Future<Employee> future = digester.asyncParse(AsyncParseMain.class.getClassLoader()
                .getResourceAsStream("employee.xml"));
        Employee employee = future.get();
        System.out.println(employee);
    }
}
