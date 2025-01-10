public class CycleTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел:");
        int i = -10;
        int j = 21;
        int k = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if (k % 2 == 0) {
                sumEvenNum = sumEvenNum + k;
            } else {
                sumOddNum = sumOddNum + k;
            }
            k++;
        } while (k <= j);
        System.out.println("В отрезке [" + i + ", " + j + "] сумма четных чисел = " + sumEvenNum + ", а нечетных = " + sumOddNum + "\n");

        System.out.println("2. Вывод чисел между min и max в порядке убывания:");
        int a = 10;
        int b = 5;
        int c = -1;
        int min;
        int max;
        max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        for (i = max - 1; i > min; i--) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("3. Вывод реверсивного числа и суммы его цифр:");
        int num = 1234;
        int sum = 0;
        while (num != 0) {
            i = num % 10;
            num /= 10;
            System.out.print(i);
            sum += i;
        }
        System.out.println();
        System.out.println("Сумма выделенных цифр: " + sum + "\n");

        System.out.println("4. Вывод чисел в несколько строк:");
        j = 0;
        for (i = 1; i < 24; i++) {
             if (i % 2 != 0) {
                System.out.printf("%3d", i);
                j++;
            }
            if (j == 5) {
                System.out.println();
                j = 0;
            }
        }

        while (j < 5 && j != 0) {
            System.out.printf("%3d", 0);
            j++;
        }

        System.out.println();
        System.out.println("5.Проверка количества двоек числа на четность/нечетность:");
        num = 3242592;
        sum = 0;
        int count = num;
        int counter;
        while (count != 0) {
            counter = count % 10;
            if (counter == 2) {
                sum++;
            }
            count = count / 10;
        }
        if (sum % 2 == 0) {
            System.out.println("В " + num + " четное (" + sum + ") количество двоек");
        } else {
            System.out.println("В " + num + " нечетное (" + sum + ") количество двоек" + "\n");
        }

        System.out.println("6. Вывод геометрических фигур:");
        for (i = 0; i < 5; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        i = 0;
        j = 0;
        while (i < 5) {
            System.out.print("#");
            i++;
            while (j < 4) {
                System.out.print("#");
                j++;
            }
            j = i;
            System.out.println();
        }

        System.out.println();
        i = 0;
        do {
            System.out.println("$");
            i++;
            if (i == 1 || i == 3) {
                System.out.print("$");
            }
            if (i == 2) {
                System.out.print("$$");
            }
        }
        while (i < 5);

        System.out.println();
        System.out.println("7. Вывод ASCII-символов:");
        System.out.println("DECIMAL          CHARACTER          DESCRIPTION");
        for (i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                char d = (char) i;
                System.out.print("  " + i + "                 " + d + "                   ");
                System.out.printf("%-25s %n",Character.getName(i));
            }
        }
        for (i = 98; i < 99;i++) {
            if (i % 2 == 0) {
                char ch = (char) i;
                System.out.print("  " + i + "                 " + ch + "                   ");
                System.out.printf("%-25s %n",Character.getName(i));
            }
        }
        for (i = 99; i < 123; i++) {
            if (i % 2 == 0) {
                char ch = (char) i;
                System.out.print("  " + i + "                " + ch + "                   ");
                System.out.printf("%-25s %n",Character.getName(i));
            }
        }

        System.out.println();
        System.out.println("8. Проверка, является ли число палиндромом:");
        i = 1234321;
        num = i;
        count = 0;
        while (num > 0) {
            j = num % 10;
            num /= 10;
            count = count * 10 + j;
        }
        if (i == count) {
            System.out.println("Число " + i + " является палиндромом");
        }

        System.out.println();
        System.out.println("9. Проверка, является ли число счастливым:");
        i = 235819;
        count = i;
        sum = 0;
        while (count >= 1000) {
            num = count % 10;
            count /= 10;
            sum = sum + num;
        }

        count = i;
        int sum1 = 0;
        while (count < 1000) {
            num = count % 10;
            count /= 10;
            sum1 = sum1 + num;
        }
        if (sum == sum1) {
            System.out.println("Число " + i + " счастливое");
        } else {
            System.out.println("Число " + i + " не счастливое");
        }

        int num1 = i / 1000;
        a = num1;
        int sum2 = 0;
        while (a != 0) {
            sum2 = sum2 + (a % 10);
            a = a / 10;
        }

        int num2 = i % 1000;
        b = num2;
        int sum3 = 0;
        while (b != 0) {
            sum3 = sum3 + (b % 10);
            b = b / 10;
        }

        System.out.println("Сумма цифр " + num1 + " = " + sum2);
        System.out.println("Сумма цифр " + num2 + " = " + sum3);

        System.out.println();
        System.out.println("10. Вывод таблицы умножения Пифагора:");
        for (i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("   ");
            } else {
                System.out.printf("%3d", i);
            }
            if (i < 10) System.out.print("|");
            for (j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            if (i == 1) {
                System.out.println();
                for (k = 0; k < 10; k++) {
                    System.out.print("___");
                }
            }
        System.out.println();
        }
    }
}