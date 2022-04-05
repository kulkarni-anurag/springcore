package com.anurag.spring.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/set/setconfig.xml");

        CarDealer dealer = (CarDealer)ctx.getBean("cardealer");

        System.out.println("Dealer Name: "+dealer.getName());
        System.out.println("Models: "+dealer.getModels());
        System.out.println("Set Type: "+dealer.getModels().getClass());

        ctx.close();
    }
}
