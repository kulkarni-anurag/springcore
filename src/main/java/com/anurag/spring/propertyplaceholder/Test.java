package com.anurag.spring.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/propertyplaceholder/dbconfig.xml");

        MyDAO mydao = (MyDAO)ctx.getBean("MyDAO");
        System.out.println(mydao);
        
        ctx.close();
    }
}
