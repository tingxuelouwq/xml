package com.kevin.xml.digester.annotation;

import org.apache.commons.digester3.annotations.rules.BeanPropertySetter;
import org.apache.commons.digester3.annotations.rules.ObjectCreate;

/**
 * @类名: Item
 * @包名：com.kevin.xml.digester.annotation
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 16:35
 * @版本：1.0
 * @描述：
 */
@ObjectCreate(pattern = "rss/channel/item")
public class Item {

    @BeanPropertySetter(pattern = "rss/channel/item/title")
    private String title;
    @BeanPropertySetter(pattern = "rss/channel/item/link")
    private String link;
    @BeanPropertySetter(pattern = "rss/channel/item/description")
    private String description;

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
