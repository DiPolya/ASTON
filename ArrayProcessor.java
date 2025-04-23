package org.example;

//создание классов исключений:
class MyArraySizeException extends Exception {
    public MyArraySizeException (String text){
        super(text);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException (String text){
        super(text);
    }
}

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
}
