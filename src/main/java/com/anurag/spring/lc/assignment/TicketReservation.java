package com.anurag.spring.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    @Override
    public String toString() {
        return "Hello Ticket Reservation called!";
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Inside Initialize Method!");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Inside Clean Up Method!");
    }
}
