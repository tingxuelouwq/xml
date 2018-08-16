package com.kevin.xml.dom4j.ns;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名: QueryModel<br/>
 * 包名：com.kevin.xml.test<br/>
 * 作者：kevin[wangqi2017@xinhua.org]<br/>
 * 时间：2018/8/16 12:45<br/>
 * 版本：1.0<br/>
 * 描述：<br/>
 */
public class QueryModel {

    private String  result ="";
    private String  errorCode ="";
    private String  errorMessage ="";
    private String  paymentFlag ="";
    private String  totalBalanceAvailable ="";
    private List<BalanceInfoListModel> balanceInfos =new ArrayList<BalanceInfoListModel>();

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getPaymentFlag() {
        return paymentFlag;
    }

    public void setPaymentFlag(String paymentFlag) {
        this.paymentFlag = paymentFlag;
    }

    public String getTotalBalanceAvailable() {
        return totalBalanceAvailable;
    }

    public void setTotalBalanceAvailable(String totalBalanceAvailable) {
        this.totalBalanceAvailable = totalBalanceAvailable;
    }

    public List<BalanceInfoListModel> getBalanceInfos() {
        return balanceInfos;
    }

    public void setBalanceInfos(List<BalanceInfoListModel> balanceInfos) {
        this.balanceInfos = balanceInfos;
    }
}
