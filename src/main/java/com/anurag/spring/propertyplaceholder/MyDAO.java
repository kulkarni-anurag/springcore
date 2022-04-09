package com.anurag.spring.propertyplaceholder;

public class MyDAO {
    private String dbServer;

    MyDAO(String dbServer){
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "DBServer: ["+dbServer+"]";
    }
}
