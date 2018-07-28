package com.kevin.xml.sax.worker;

/**
 * @类名: Worker
 * @包名：com.kevin.xml.sax
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/26 16:24
 * @版本：1.0
 * @描述：
 */
public class Worker {

    private String id;
    private String name;
    private String status;
    private String address;
    private String money;

    public Worker() {
    }

    // getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
