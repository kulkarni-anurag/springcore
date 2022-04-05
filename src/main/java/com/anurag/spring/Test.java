package com.anurag.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Employee emp = (Employee)ctx.getBean("emp");

        System.out.println("Employee Id: "+emp.getId());
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Mobile: "+emp.getMobile());

        ctx.close();
    }
}
