package com.anurag.spring.lc;

public class Patient {
    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        System.out.println("Inside setter method!");
        this.id = id;
    }

    public void hi(){
        System.out.println("Inside Hi Method!");
    }

    public void bye(){
        System.out.println("Inside Bye Method!");
    }

    @Override
    public String toString() {
        return "Patient: [id = "+id+"]";
    }
}
