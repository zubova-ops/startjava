package com.startjava.lesson_1.base;

public class CycleTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел:");
        int startRange = -10;
        int exitRange = 21;
        int counter = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNum = sumEvenNum + counter;
            } else {
                sumOddNum = sumOddNum + counter;
            }
            counter++;
        } while (counter <= exitRange);
        System.out.println("В отрезке [" + startRange + ", " + exitRange + "] сумма четных чисел = " + sumEvenNum + ", а нечетных = " + sumOddNum + "\n");

        System.out.println("2. Вывод чисел между min и max в порядке убывания:");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int min;
        int max;
        max = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        min = number1 < number2 ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр:");
        int num = 1234;
        int sum = 0;
        int digit;
        while (num != 0) {
            digit = num % 10;
            num /= 10;
            System.out.print(digit);
            sum += digit;
        }
        System.out.println();
        System.out.println("Сумма выделенных цифр: " + sum + "\n");

        System.out.println("4. Вывод чисел в несколько строк:");
        counter = 0;
        for (int i = 1; i < 24; i++) {
             if (i % 2 != 0) {
                System.out.printf("%3d", i);
                counter++;
            }
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }

        while (counter < 5 && counter != 0) {
            System.out.printf("%3d", 0);
            counter++;
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность:");
        int number = 3242592;
        int sumOfTwos = 0;
        int copyNumber = number;
        while (copyNumber != 0) {
            counter = copyNumber % 10;
            if (counter == 2) {
                sumOfTwos++;
            }
            copyNumber /= 10;
        }
        if (sumOfTwos % 2 == 0) {
            System.out.println("В " + number + " четное (" + sumOfTwos + ") количество двоек");
        } else {
            System.out.println("В " + number + " нечетное (" + sumOfTwos + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур:");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        counter = 0;
        int count = 0;
        while (counter < 5) {
            System.out.print("#");
            counter++;
            while (count < 4) {
                System.out.print("#");
                count++;
            }
            count = counter;
            System.out.println();
        }

        System.out.println();
        counter = 0;
        do {
            System.out.println("$");
            counter++;
            if (counter == 1 || counter == 3) {
                System.out.print("$");
            }
            if (counter == 2) {
                System.out.print("$$");
            }
        }
        while (counter < 5);

        System.out.println("\n7. Вывод ASCII-символов:");
        System.out.println("DECIMAL          CHARACTER          DESCRIPTION");
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                char d = (char) i;
                System.out.print("  " + i + "                 " + d + "                   ");
                System.out.printf("%-25s %n",Character.getName(i));
            }
        }
        for (int i = 98; i < 99;i++) {
            if (i % 2 == 0) {
                char ch = (char) i;
                System.out.print("  " + i + "                 " + ch + "                   ");
                System.out.printf("%-25s %n",Character.getName(i));
            }
        }
        for (int i = 99; i < 123; i++) {
            if (i % 2 == 0) {
                char ch = (char) i;
                System.out.print("  " + i + "                " + ch + "                   ");
                System.out.printf("%-25s %n",Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом:");
        number = 1234321;
        copyNumber = number;
        count = 0;
        while (copyNumber > 0) {
            int j = copyNumber % 10;
            copyNumber /= 10;
            count = count * 10 + j;
        }
        if (number == count) {
            System.out.println("Число " + number + " является палиндромом");
        } else {
            System.out.println("Число" + number + "не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым:");
        number = 123321;
        copyNumber = number;
        digit = 0;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 1; i < 7; i++) {
            digit = copyNumber % 10;
            copyNumber /= 10;
            if (i >= 1 && i <= 3) {
                sumRight = sumRight + digit;
            } else {
                sumLeft = sumLeft + digit;
            }
        }
        if (sumLeft == sumRight) {
            System.out.println("Число " + number + " счастливое");
        }else {
            System.out.println("Число " + number + " не счастливое");
        }
        System.out.println("Сумма цифр " + number / 1000 + " = " + sumLeft);
        System.out.println("Сумма цифр "+ number % 1000 + " = " + sumRight);


        System.out.println("\n10. Вывод таблицы умножения Пифагора:");
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("   ");
            } else {
                System.out.printf("%3d", i);
            }
            if (i < 10) System.out.print("|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            if (i == 1) {
                System.out.println();
                for (int k = 0; k < 10; k++) {
                    System.out.print("___");
                }
            }
        System.out.println();
        }
    }
}