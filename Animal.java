package org.example;

public class Animal {
    String name;
    static int animalCount = 0;

    public Animal (String name){
        this.name = name;
        animalCount++;
    }

    public void run (int s){};
    public void swim (int s){};
    public static int getAnimalCount(){
        return animalCount;
    }
}
