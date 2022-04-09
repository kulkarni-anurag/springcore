package com.anurag.spring.constructorinjection.ambiguity;

public class Addition {

    Addition(int a, double b){
        System.out.println("Inside constructor");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
