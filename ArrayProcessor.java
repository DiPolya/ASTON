package org.example;

public class ArrayProcessor {
    public static int arrayProcess (String[][] array) throws MyArraySizeException,
            MyArrayDataException {

        //1. Проверяем размер массива на соответствие размерам 4Х4
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива не соответствует размерам 4Х4");
        }


        //2. Суммирование элементов массива
        int summa;
        summa = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summa += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    //e.printStackTrace();
                    throw new MyArrayDataException("Данные неверны в ячейке [" + i + "] [" + j + "]"
                            + array[i][j]);
                }
            }
        }

        return summa;
    }

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