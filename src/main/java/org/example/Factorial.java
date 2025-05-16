package org.example;

public class Factorial {
    public static long execute (int n){
        if (n < 0) throw new IllegalArgumentException("Должно быть n >= 0");
        long n_factorial = 1;
        for (int i = 2; i <= n; i++) n_factorial *= i;
        return n_factorial;
    }
}