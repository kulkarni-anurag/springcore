package com.anurag.spring.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/innerbeans/innerbeanconfig.xml");

        Employee emp = (Employee)ctx.getBean("employee");
        System.out.println(emp);
        System.out.println("Hash Code: "+emp.hashCode());

        Employee emp2 = (Employee)ctx.getBean("employee");
        System.out.println(emp2);
        System.out.println("Hash Code: "+emp2.hashCode());

        ctx.close();
    }
}
