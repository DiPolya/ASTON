package org.example;

public class Circle implements Geom {
    float r; //радиус круга
    String color; //цвет заливки
    String borderColor; //цвет границы

    public Circle (float r, String color, String borderColor){
        this.r = r;
        this.color = color;
        this.borderColor = borderColor;
    }
    @Override
    public double getArea(){
        return Math.PI * r * r;
    }
    @Override
    public double getPerimeter(){
        return Math.PI * r * 2;
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public String getBorderColor(){
        return borderColor;
    }

}
