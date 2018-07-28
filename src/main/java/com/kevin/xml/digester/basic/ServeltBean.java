package com.kevin.xml.digester.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @类名: ServeltBean
 * @包名：com.kevin.xml.digester
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/28 14:52
 * @版本：1.0
 * @描述：
 */
public class ServeltBean {

    private String servletName;
    private String servletClass;
    private Map<String, String> initParams = new HashMap<>();

    public void addInitParam(String paramName, String paramValue) {
        initParams.put(paramName, paramValue);
    }

    // getter and setter

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getServletClass() {
        return servletClass;
    }

    public void setServletClass(String servletClass) {
        this.servletClass = servletClass;
    }

    public Map<String, String> getInitParams() {
        return initParams;
    }

    public void setInitParams(Map<String, String> initParams) {
        this.initParams = initParams;
    }

    @Override
    public String toString() {
        return "ServeltBean{" +
                "servletName='" + servletName + '\'' +
                ", servletClass='" + servletClass + '\'' +
                ", initParams=" + initParams +
                '}';
    }
}
