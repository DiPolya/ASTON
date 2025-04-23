package org.example;

public class Main {

// создадим несколько массивов для проверки исключений
    public static void main(String[] args) {
    String[][] arrayOne = {  //массив 4Х4
            {"4","0","1","3"},
            {"-1","7","-5","9"},
            {"6","-2","0","4"},
            {"4","8","9","-3"}
    };

        String[][] arrayTwo = { //массив 1Х4
                {"4","0","1","3"}
        };

        String[][] arrayThree = { //массив с символом и словом
                {"4","0","1","!"},
                {"-1","7","-5","9"},
                {"6","Mew","0","4"},
                {"4","8","9","-3"}
        };

        try {
            int result = ArrayProcessor.arrayProcess(arrayOne);
            System.out.println("Сумма: " + result);}
        catch (MyArraySizeException | MyArrayDataException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
           ArrayProcessor.arrayProcess(arrayTwo);}
        catch (MyArraySizeException | MyArrayDataException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            ArrayProcessor.arrayProcess(arrayThree);}
        catch (MyArraySizeException | MyArrayDataException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int [] arr = new int[2];
            System.out.println(arr[3]);}
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }


    }
}