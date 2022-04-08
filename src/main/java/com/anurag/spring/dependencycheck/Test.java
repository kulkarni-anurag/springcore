package com.anurag.spring.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/dependencycheck/depecheckconfig.xml");

        Prescription prep = (Prescription)ctx.getBean("prescription");
        System.out.println(prep);

        ctx.close();
    }
}
