package com.anurag.spring.wsclient;

public class WsClient {
    private String url;
    private String userName;
    private String password;

    WsClient(String url, String userName, String password){
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "WsClient: [url: "+url+", userName: "+userName+", password:"+password+"]";
    }
}
