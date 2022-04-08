package com.anurag.spring.uni;

public class Address {
    private int flno;
    private String societyName;
    private String landmark;

    public int getFlno(){
        return flno;
    }

    public void setFlno(int flno){
        this.flno = flno;
    }

    public String getSocietyName(){
        return societyName;
    }

    public void setSocietyName(String societyName){
        this.societyName = societyName;
    }

    public String getLandmark(){
        return landmark;
    }

    public void setLandmark(String landmark){
        this.landmark = landmark;
    }

    @Override
    public String toString() {
        return "Address: [flno: "+flno+", Society: "+societyName+", Landmark: "+landmark+"]";
    }
}
