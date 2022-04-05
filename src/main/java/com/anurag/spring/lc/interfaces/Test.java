package com.anurag.spring.lc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/lc/interfaces/interfacesconfig.xml");
        
        Patient pat = (Patient)ctx.getBean("patient");

        System.out.println(pat);
        
        ctx.close();
    }
}
