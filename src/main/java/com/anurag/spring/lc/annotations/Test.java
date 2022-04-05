package com.anurag.spring.lc.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/lc/annotations/annotationsconfig.xml");
        
        Patient pat = (Patient)ctx.getBean("patient");

        System.out.println(pat);
        
        ctx.close();
    }
}
