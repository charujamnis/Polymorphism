package com.dtcc.polypets;

public class Dog extends Pet{
    private String name;
    private String speak;

    public Dog(String name) {
        super(name);
    }
    public Dog(String name, String speak) {
        super(name, speak);
    }
    public String getSpeak(){
        String speak="ROOF ROOF";
        return speak;
    }
}
