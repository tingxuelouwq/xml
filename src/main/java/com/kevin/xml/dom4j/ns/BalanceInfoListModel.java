package com.kevin.xml.dom4j.ns;

/**
 * 类名: BalanceInfoListModel<br/>
 * 包名：com.kevin.xml.test<br/>
 * 作者：kevin[wangqi2017@xinhua.org]<br/>
 * 时间：2018/8/16 12:45<br/>
 * 版本：1.0<br/>
 * 描述：<br/>
 */
public class BalanceInfoListModel {

    private String balanceTypeFlag = "";
    private String BalanceAvailable = "";

    public String getBalanceTypeFlag() {
        return balanceTypeFlag;
    }

    public void setBalanceTypeFlag(String balanceTypeFlag) {
        this.balanceTypeFlag = balanceTypeFlag;
    }

    public String getBalanceAvailable() {
        return BalanceAvailable;
    }

    public void setBalanceAvailable(String balanceAvailable) {
        BalanceAvailable = balanceAvailable;
    }
}
