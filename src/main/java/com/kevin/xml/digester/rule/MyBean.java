package com.kevin.xml.digester.rule;

/**
 * @类名: MyBean
 * @包名：com.kevin.xml.digester.rule
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 15:03
 * @版本：1.0
 * @描述：
 */
public class MyBean {

    private Boolean beanSuper;
    private Float rate;

    public MyBean() {
    }

    public MyBean(Boolean beanSuper, Float rate) {
        this.beanSuper = beanSuper;
        this.rate = rate;
    }

    public Boolean getBeanSuper() {
        return beanSuper;
    }

    public void setBeanSuper(Boolean beanSuper) {
        this.beanSuper = beanSuper;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "beanSuper=" + beanSuper +
                ", rate=" + rate +
                '}';
    }
}
