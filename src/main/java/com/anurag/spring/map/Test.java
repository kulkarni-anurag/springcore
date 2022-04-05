package com.anurag.spring.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/map/mapconfig.xml");

        Customer cust = (Customer)ctx.getBean("customer");

        System.out.println("Customer Name: "+cust.getName());
        System.out.println("Products: "+cust.getProducts());
        System.out.println("Type: "+cust.getProducts().getClass());

        ctx.close();
    }
}
