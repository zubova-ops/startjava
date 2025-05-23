package com.startjava.lesson_4.array;

import java.util.Random;

public class arrayElements {
    public static void main(String[] args) {
        arrayIndex(-1);
        arrayIndex(15);
        arrayIndex(0);
        arrayIndex(14);
    }

    public static void arrayIndex(int index) {
        if (index < 0) {
            System.out.println("Ошибка системы! Отрицательный индекс: "  + index);
        } else if (index >= 15) {
            System.out.println("Ошибка системы! Выход за пределы массива. Индекс: " + index );
        } else {
            double[] arrayOriginal = new double[15];
            Random random = new Random();
            for (int i = 0; i < arrayOriginal.length; i++) {
                arrayOriginal[i] = Math.floor(random.nextDouble() * 1000) / 1000.0;
            }
            System.out.println("Исходный массив: ");
            printArray(arrayOriginal);

            double arrayOriginalIndex = (double)arrayOriginal[index];
            System.out.println("\nЗначение массива по индексу: " + arrayOriginalIndex);

            double[] modifiedArray = new double[arrayOriginal.length];
            System.arraycopy(arrayOriginal, 0, modifiedArray, 0, arrayOriginal.length);

            int counter = 0;
            for (int i = 0; i < modifiedArray.length; i++) {
                if (modifiedArray[i] > arrayOriginalIndex) {
                    modifiedArray[i] = 0;
                    counter++;
                }
            }
            System.out.println("Количество обнулённых ячеек массива: " + counter);
            System.out.println("Изменённый массив: ");
            printArray(modifiedArray);
            System.out.println();
        }
    }

    private static void printArray(double[] modifiedArray) {
        for (int i = 0; i < 8; i++) {
            System.out.print(modifiedArray[i] + " ");
        }
        System.out.println();
        for (int i = 8; i < 15; i++) {
            System.out.print(modifiedArray[i] + " ");
        }
    }
}