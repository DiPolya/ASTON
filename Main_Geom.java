package org.example;

public class Main_Geom {
    public static void main(String[] args){
        Geom circle = new Circle(10,"Зелёный","Розовый");
        Geom rectangle = new Rectangle(18,29,"Бирюзовый", "Оранжевый");
        Geom triangle = new Triangle(3,4,5,"Серый", "Голубой") ;

        circle.figureInfo();
        rectangle.figureInfo();
        triangle.figureInfo();
    }
}