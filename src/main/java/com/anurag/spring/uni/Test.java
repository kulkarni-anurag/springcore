package com.anurag.spring.uni;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/uni/uniconfig.xml");
        
        University uni = (University)ctx.getBean("university");
        System.out.println(uni);
        System.out.println(uni.hashCode());

        University uni2 = (University)ctx.getBean("university");
        System.out.println(uni2);
        System.out.println(uni2.hashCode());
        
        ctx.close();
    }
}
