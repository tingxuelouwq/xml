package com.kevin.xml.digester.ns;

import java.util.ArrayList;
import java.util.List;

/**
 * @类名: Foo
 * @包名：com.kevin.xml.digester.ns
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/28 16:26
 * @版本：1.0
 * @描述：
 */
public class Foo {

    private String name;
    private List<Bar> barList = new ArrayList<>();

    public Foo() {
    }

    public void addBar(Bar bar) {
        barList.add(bar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bar> getBarList() {
        return barList;
    }

    public void setBarList(List<Bar> barList) {
        this.barList = barList;
    }
}
