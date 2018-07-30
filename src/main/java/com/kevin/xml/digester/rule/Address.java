package com.kevin.xml.digester.rule;

/**
 * @类名: Address
 * @包名：com.kevin.xml.digester.rule
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 9:39
 * @版本：1.0
 * @描述：
 */
public class Address {

    private String type;
    private String city;
    private int state;

    public Address() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getState() {
        return state;
    }

    public void setState(String state) {
        this.state = Integer.valueOf(state);
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "type='" + type + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                '}';
    }
}
