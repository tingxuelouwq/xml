package com.kevin.xml.digester.xml;

import java.util.ArrayList;
import java.util.List;

/**
 * @类名: ChartRegistry
 * @包名：com.kevin.xml.digester.annotation
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/7/30 15:47
 * @版本：1.0
 * @描述：
 */
public class ChartRegistry {

    private List<ChartConfig> chartConfigs = new ArrayList<>();

    public void addChart(ChartConfig chartConfig) {
        chartConfigs.add(chartConfig);
    }

    @Override
    public String toString() {
        return "ChartRegistry{" +
                "chartConfigs=" + chartConfigs +
                '}';
    }
}
