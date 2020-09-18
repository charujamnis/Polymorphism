package com.dtcc.polypets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetTest {
    Pet[] petList;
    @Before
    public void setup(){
        petList=new Pet[3];
        petList[0]=new Dog("Rocky","ROOF ROOF");
        petList[1]=new Cat("Cookie","MEOW MEOW");
        petList[2]=new Cow("Roxy","MOOO MOOO");
    }
    @Test
    public void testPetName(){
       // petFactory.userInput();
        Assert.assertEquals("Rocky",petList[0].getName());
        Assert.assertEquals("Cookie",petList[1].getName());
        Assert.assertEquals("Roxy",petList[2].getName());
    }
    @Test
    public void testPetSpeak(){
        Assert.assertEquals("ROOF ROOF",petList[0].getSpeak());
        Assert.assertEquals("MEOW MEOW",petList[1].getSpeak());
        Assert.assertEquals("MOOO MOOO",petList[2].getSpeak());
    }
}
