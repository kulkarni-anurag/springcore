package com.anurag.spring.wsclient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/wsclient/wsconfig.xml");

        WsClient ws = (WsClient)ctx.getBean("wsclient");
        System.out.println(ws);

        ctx.close();
    }
}
