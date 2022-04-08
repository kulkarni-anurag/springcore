package com.anurag.spring.uni;

import org.springframework.beans.factory.annotation.Required;

public class University {
    private int id;
    private String universityName;
    private Address address;
    
    public int getId(){
        return id;
    }

    @Required
    public void setId(int id){
        this.id = id;
    }

    public String getUniversityName(){
        return universityName;
    }

    public void setUniversityName(String universityName){
        this.universityName = universityName;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "University: [Id: "+id+", Name: "+universityName+", Address: "+address+"]";
    }
}
