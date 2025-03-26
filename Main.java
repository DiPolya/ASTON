package org.example;


import java.io.PrintStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        taskFive(32, -12);
        check(23);
        methodTrue(9);
        Str(String.valueOf(9), 8);
        method9(2022);
        method10();
        method11();
        method12();
        method13();
        method14(5,1);
    }


    public static void printThreeWords() {
        System.out.println(" Orange \n Banana \n Apple");
    }


    public static void checkSumSign() {
        int a = 7;
        int b = -8;

        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void printColor(){
        int value = 101;

        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value > 100){
            System.out.println("Зелёный");}

        else {
            System.out.println("Жёлтый");
        }
    }


    public static void compareNumbers(){
        int a = 176;
        int b = -90;

        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }


    public static void taskFive(int x, int y){
        int c = x + y;

        boolean var1;
        var1 = (c >= 10 & c <= 20);
        System.out.println(var1);

    }


    public static void check(int k){
        if (k >= 0){
            System.out.println("Число " + k + " положительное");
        }
        else
            System.out.println("Число " + k + " отрицательное");
    }


    public static void methodTrue(int t) {

        boolean var2;
        var2 = (t < 0);
        System.out.println(var2);

    }


    public static void Str(String var3, int w){
        for (int i = 1; i <= w; i ++) {
        System.out.println("[" + i + "] " + var3);
        }
    }


    public static void method9 (int y){

        boolean var4;
        var4 = (y % 100 != 0 && y % 4 ==0 || y % 400 == 0);
        System.out.println("Год " + y + " високосный - " + var4);
    }


    public static void method10(){
        int [] q = {1, 1, 0, 1, 0};
        int m = 5;

        for (int i = 0; i < m; i++) {
            if (q[i] == 0) {
                q[i] = 1;
            }
            else {
                q[i] = 0;
            }

        }
        System.out.println(Arrays.toString(q));
    }


    public static void method11(){
        int [] a = new int [100];
        a [0] = 1;
        for (int i = 1; i < a.length ; i++) {
            a[i] = a[i-1] + 1;
        }
        System.out.println(Arrays.toString(a));
    }


    public static void method12(){
        int [] s = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < s.length; i++) {
            if (s[i] < 6){
                s[i] = s[i]*2;
            }
            else {
            }
        }
        System.out.println(Arrays.toString(s));
    }

    public static void method13(){
        int x = 4;
        int y = 4;
        int [][] arr = new int [x][y];

        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){
            arr[i][i] = 1;
                System.out.printf("%d %n", arr[i][j]);
            }

        System.out.println();
          }

    }


    public static int [] method14(int len, int initialValue){
        int [] arr = new int [len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}