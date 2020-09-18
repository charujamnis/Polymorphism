package com.dtcc.polypets;

public class Cat extends Pet{


    public Cat(String name) {
        super(name);
    }
    public Cat(String name, String speak) {
        super(name, speak);
    }

    public String getSpeak(){
        String speak="MEOW MEOW";
        return speak;
    }
}
