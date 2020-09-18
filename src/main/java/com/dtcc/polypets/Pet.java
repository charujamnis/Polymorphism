package com.dtcc.polypets;
import java.util.*;

public class Pet {

    private String name;
    private String speak;

    public Pet(String name){
        this.name=name;
    }
    public Pet(String name, String speak){
        this.name=name;
        this.speak=speak;
    }
    public String getName() {
        return name;
    }
    public String getSpeak() {
        return this.speak;
    }

}
