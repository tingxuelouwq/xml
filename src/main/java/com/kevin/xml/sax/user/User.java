package com.kevin.xml.sax.user;

/**
 * @类名: User
 * @包名：com.kevin.xml.sax.user
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/28 14:58
 * @版本：1.0
 * @描述：
 */
public class User {

    private long id;
    private String name;
    private String password;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
