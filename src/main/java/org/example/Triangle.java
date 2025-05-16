package org.example;

public class Triangle {
    public static double areaTriangle (double  a, double  h){
        if (a <= 0 || h <= 0) throw new IllegalArgumentException("Основание (a) и высота (h) должны быть положительными");
        return 0.5 * a * h;
    }
}
