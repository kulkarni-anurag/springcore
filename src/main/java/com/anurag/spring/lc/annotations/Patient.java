package com.anurag.spring.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        System.out.println("Inside setter method!");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient: [id = "+id+"]";
    }

    @PostConstruct
    public void hi(){
        System.out.println("Inside Hi Method!");
    }

    @PreDestroy
    public void bye(){
        System.out.println("Inside Bye Method!");
    }
}
