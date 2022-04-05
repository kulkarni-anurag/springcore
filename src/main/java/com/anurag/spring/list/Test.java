package com.anurag.spring.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/list/listconfig.xml");

        Hospital hospi = (Hospital)ctx.getBean("hospital");

        System.out.println("Hospital Name: "+hospi.getName());
        System.out.println("Departments: "+hospi.getDepartments());
        System.out.println("List Type: "+hospi.getDepartments().getClass());

        ctx.close();
    }
}
