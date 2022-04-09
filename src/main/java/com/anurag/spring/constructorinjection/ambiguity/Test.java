package com.anurag.spring.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/constructorinjection/ambiguity/constconfig.xml");

        Addition add = (Addition)ctx.getBean("addition");
        //System.out.println(add);

        ctx.close();
    }
}
