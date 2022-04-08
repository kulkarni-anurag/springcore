package com.anurag.spring.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/constructorinjection/constconfig.xml");

        Employee emp = (Employee)ctx.getBean("employee");
        System.out.println(emp);

        ctx.close();
    }
}
