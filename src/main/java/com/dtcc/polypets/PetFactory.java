package com.dtcc.polypets;

import java.util.*;

public class PetFactory {
    public void userInput(){

        int numberOfPets=0;
        Scanner input=new Scanner(System.in);
        System.out.println("How many pets you have?");
        numberOfPets=input.nextInt();
        input.nextLine();

        Pet[] petList=new Pet[numberOfPets];

        for(int i=0;i<numberOfPets;i++){
            System.out.println("What kind of pets are they?");
            String typeOfPet=input.nextLine();

            System.out.println("What is the name of the pet?");
            String nameOfPet=input.nextLine();

            if(typeOfPet.equalsIgnoreCase("DOG")){
                petList[i]=new Dog(nameOfPet);
            }else if(typeOfPet.equalsIgnoreCase("CAT")) {
                petList[i]=new Cat(nameOfPet);
            }else if(typeOfPet.equalsIgnoreCase("COW")){
                petList[i]=new Cow(nameOfPet);
            }
        }

        for(int j=0;j<numberOfPets;j++){
            System.out.println(petList[j].getName() +" "+ petList[j].getSpeak());
        }
    }

}
