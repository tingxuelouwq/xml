package com.kevin.xml.digester.annotation;

import org.apache.commons.digester3.annotations.rules.BeanPropertySetter;
import org.apache.commons.digester3.annotations.rules.ObjectCreate;
import org.apache.commons.digester3.annotations.rules.SetNext;

import java.util.ArrayList;
import java.util.List;

/**
 * @类名: Channel
 * @包名：com.kevin.xml.digester.annotation
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 16:30
 * @版本：1.0
 * @描述：
 */
@ObjectCreate(pattern = "rss/channel")
public class Channel {

    @BeanPropertySetter(pattern = "rss/channel/title")
    private String title;
    @BeanPropertySetter(pattern = "rss/channel/link")
    private String link;
    @BeanPropertySetter(pattern = "rss/channel/description")
    private String description;
    @BeanPropertySetter(pattern = "rss/channel/language")
    private String language;
    @BeanPropertySetter(pattern = "rss/channel/rating")
    private String rating;

    private Image image;
    private List<Item> items = new ArrayList<>();

    public Channel() {
    }

    @SetNext
    public void setImage(Image image) {
        this.image = image;
    }

    @SetNext
    public void addItem(Item item) {
        items.add(item);
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Image getImage() {
        return image;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", rating='" + rating + '\'' +
                ", image=" + image +
                ", items=" + items +
                '}';
    }
}
