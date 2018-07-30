package com.kevin.xml.digester.annotation;

import org.apache.commons.digester3.annotations.rules.BeanPropertySetter;
import org.apache.commons.digester3.annotations.rules.ObjectCreate;

/**
 * @类名: Image
 * @包名：com.kevin.xml.digester.annotation
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 16:32
 * @版本：1.0
 * @描述：
 */
@ObjectCreate(pattern = "rss/channel/image")
public class Image {

    @BeanPropertySetter(pattern = "rss/channel/image/title")
    private String title;
    @BeanPropertySetter(pattern = "rss/channel/image/url")
    private String url;
    @BeanPropertySetter(pattern = "rss/channel/image/link")
    private String link;
    @BeanPropertySetter(pattern = "rss/channel/image/width")
    private int width;
    @BeanPropertySetter(pattern = "rss/channel/image/height")
    private int height;
    @BeanPropertySetter(pattern = "rss/channel/image/description")
    private String description;

    public Image() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Image{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", link='" + link + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", description='" + description + '\'' +
                '}';
    }
}
