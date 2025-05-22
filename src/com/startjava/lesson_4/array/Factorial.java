package com.startjava.lesson_4.array;

public class Factorial {
    public static void main(String[] args) {
        arrayValues(new int[0]);
        arrayValues(null);
        arrayValues(new int[]{8, 0, 9});
        arrayValues(new int[]{-3, 1, 7, 13});
        arrayValues(new int[]{-22, -0});
    }

    public static void arrayValues(int[] arraysOriginal) {
        if (arraysOriginal == null) {
            System.out.println("Нулевое значение!");
        } else if (arraysOriginal.length == 0) {
            System.out.println("Нулевая длина массива");
        } else {
            int[] factorialArray = new int[arraysOriginal.length];
            for (int i = 0; i < arraysOriginal.length; i++) {
                int arrayNumbers = arraysOriginal[i];
                if (arrayNumbers < 0) {
                    factorialArray[i] = arrayNumbers;
                } else {
                    int factorial = 1;
                    for (int j = 1; j <= arrayNumbers; j++) {
                        factorial = factorial * j;
                    }
                    factorialArray[i] = factorial;
                }
            }
            for (int i = 0; i < factorialArray.length; i++) {
                if (factorialArray[i] < 0) {
                    System.out.println("Ошибка: Факториал " + factorialArray[i] + " не определен!");
                } else {
                    System.out.print(factorialArray[i] + " ");
                }
            }
        }
    }
}