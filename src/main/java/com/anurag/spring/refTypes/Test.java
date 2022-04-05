package com.anurag.spring.refTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/refTypes/refconfig.xml");

        Student stud = (Student)ctx.getBean("student");

        System.out.println(stud);

        ctx.close();
    }
}
