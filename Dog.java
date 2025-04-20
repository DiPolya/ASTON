package org.example;

public class Dog extends Animal {
    static int dogCount = 0;
    public Dog (String name){
        super(name);
        dogCount++;
    }

    public void run (int s){
        if (s >= 0 & s <= 500){
            System.out.println(name + " пробежал " + s + "м.");
        }
        else{
            System.out.println("У "+ name + " указано неверное расстояние");}

    }

    public void swim (int s){
        if (s >= 0 & s <= 10){
            System.out.println(name + " проплыл " + s + "м.");
        }
        else{
            System.out.println("У "+ name + " указано неверное расстояние");}
    }
    public static int getDogCount (){
        return dogCount;
    }
}
