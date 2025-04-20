package org.example;

public class Bowl {
    int food;
    public Bowl (int food){
        this.food = Math.max(food,0);
    }
    public boolean stateFood (int x){
        if (food >= x){
            food -= x;
            return true;
        }
        return false;
    }

    public void addFood (int x){
        if (x > 0){
            food += x;
            System.out.println("Еды добавили: " + x + " В миске сейчас: " + food);
        }
    }

    public int getFood(){
        return food;
    }
}
