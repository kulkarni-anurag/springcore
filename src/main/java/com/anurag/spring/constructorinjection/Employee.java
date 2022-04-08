package com.anurag.spring.constructorinjection;

public class Employee {
    private int id;
    private Address address;

    Employee (int id, Address address){
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee: [Id: "+id+", Address: "+address+"]";
    }
}
