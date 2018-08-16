package com.kevin.xml.dom4j.ns;

import org.dom4j.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名: Main<br/>
 * 包名：com.kevin.xml.test<br/>
 * 作者：kevin[wangqi2017@xinhua.org]<br/>
 * 时间：2018/8/16 12:46<br/>
 * 版本：1.0<br/>
 * 描述：<br/>
 */
public class Main {

    public static void main(String[] args) throws DocumentException {
        String xml ="<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'><soapenv:Body><ns1:queryBalanceBonResponse xmlns:ns1='http://chinasoftinc.com/BonWebservice/'><result>0</result><errorCode>0</errorCode><errorMessage>查询余额成功</errorMessage><paymentFlag>0</paymentFlag><totalBalanceAvailable>20</totalBalanceAvailable><balanceDetail><balanceInfo><balanceTypeFlag>0</balanceTypeFlag><BalanceAvailable>200</BalanceAvailable></balanceInfo><balanceInfo><balanceTypeFlag>1</balanceTypeFlag><BalanceAvailable>0</BalanceAvailable></balanceInfo></balanceDetail></ns1:queryBalanceBonResponse></soapenv:Body></soapenv:Envelope>";
        parse2(xml);
    }

    private static void parse1(String xml) throws DocumentException {
        Document doc = DocumentHelper.parseText(xml);
        QueryModel queryModel =new QueryModel();
        Element rootElrm= doc.getRootElement();

        Element el = rootElrm.element("Body");
        Element node = el.element("queryBalanceBonResponse");
        System.out.println(node.asXML());
        System.out.println(node.selectSingleNode("result").getText());
    }

    private static void parse2(String xml) throws DocumentException {
        Map<String, String> map = new HashMap<>();
        map.put("soapenv","http://schemas.xmlsoap.org/soap/envelope/");
        map.put("ns1","http://chinasoftinc.com/BonWebservice/");
        Document doc = DocumentHelper.parseText(xml);
        XPath xPath = doc.createXPath("soapenv:Envelope/soapenv:Body/ns1:queryBalanceBonResponse");
        xPath.setNamespaceURIs(map);

        Node node = xPath.selectSingleNode(doc);
        System.out.println(node.selectSingleNode("result").getText());
    }
}
