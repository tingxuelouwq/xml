package com.kevin.xml.digester.xml;

/**
 * @类名: ChartConfig
 * @包名：com.kevin.xml.digester.annotation
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 15:47
 * @版本：1.0
 * @描述：
 */
public class ChartConfig {

    private String id;
    private boolean legendVisible;
    private String type;
    private int width;
    private String description;

    public ChartConfig() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isLegendVisible() {
        return legendVisible;
    }

    public void setLegendVisible(boolean legendVisible) {
        this.legendVisible = legendVisible;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ChartConfig{" +
                "id='" + id + '\'' +
                ", legendVisible=" + legendVisible +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", description='" + description + '\'' +
                '}';
    }
}
