package com.anurag.spring.lc.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/lc/assignment/ticketconfig.xml");

        TicketReservation ticket = (TicketReservation)ctx.getBean("ticketreservation");
        System.out.println(ticket);
        
        ctx.close();
    }
}
