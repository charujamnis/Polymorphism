package com.dtcc.polypets;

public class Cow extends Pet {

    public Cow(String name) {
        super(name);
    }
    public Cow(String name, String speak) {
        super(name, speak);
    }

    public String getSpeak(){
        String speak="MOOO MOOO";
        return speak;
    }
}
