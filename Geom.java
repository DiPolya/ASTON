package org.example;

public interface Geom {
    default double getArea(){
        return 0;
    };
    default double getPerimeter(){
        return 0;
    };
    default String getColor(){
        return "";
    };
    default String getBorderColor(){
        return "";
    };

    default void figureInfo(){
        System.out.println("\nПлощадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет залливки : " + getColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
