package org.example;

public class Rectangle implements Geom {
    double a, b;
    String color; //цвет заливки
    String borderColor; //цвет границы

    public Rectangle (double a, double b, String color, String borderColor){
        this.a = a;
        this.b = b;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea (){
        return a*b;
    }
    @Override
    public double getPerimeter(){
        return 2*(a+b);
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
