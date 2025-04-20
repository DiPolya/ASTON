package org.example;

public class Cat extends Animal {
    static int catCount = 0;
    boolean sat; //сытость кота
    int app; // уровень аппетита
    public Cat (String name, int app){
        super(name);
        this.app = app;
        this.sat = false;
        catCount++;
    }

    public void eat (Bowl bowl){
        if (!sat && bowl.stateFood(app)){
            sat = true;
            System.out.println(name + " поел, аппетит: " + app);
        }
        else if (!sat) {
            System.out.println(name + " кот голоден, нет достаточной еды в миске.");
        }
    }

    public boolean isSat(){
        return sat;
    }

    public int getApp(){
        return app;
    }

    public String getName(){
        return name;
    }
    public void run (int s){
        if (s >= 0 & s <= 200){
            System.out.println(name + " пробежал " + s + "м.");
        }
        else{
            System.out.println("У "+ name + " указано неверное расстояние");}

    }
    public void swim (int s){
        System.out.println(name + " не умеет плавать ");
    }
    public static int getCatCount (){
        return catCount;
    }
}
