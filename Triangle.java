package org.example;

public class Triangle implements Geom {
    double c, f, d; //стороны треугольника
    String color; //цвет заливки
    String borderColor; //цвет границы

    public Triangle (double c, double f, double d, String color, String borderColor ){
        this.c = c;
        this.f = f;
        this.d = d;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea (){
        double w = getPerimeter() /2; //полупериметр
        return Math.sqrt(w*(w-c)*(w-f)*(w-d));
    }

    @Override
    public double getPerimeter (){
        return c+f+d;
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
