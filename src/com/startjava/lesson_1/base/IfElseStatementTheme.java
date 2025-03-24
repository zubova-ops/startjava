package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {

        System.out.println("1.Перевод псевдокода на язык Java:");
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("female");
        } else {
            System.out.println("male gender");
        }
        System.out.println();

        int age = 5;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Ребёнок");
        }
        System.out.println();

        double height = 1.67;
        if (height < 1.8) {
            System.out.println("Средний рост");
        } else {
            System.out.println("Высокий рост");
        }
        System.out.println();

        char nameFirstLetter = "Dasha".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("Маргарита");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Иванна");
        } else {
            System.out.println("Имя на букву: " + nameFirstLetter);
        }

        System.out.println();

        System.out.println("2.Поиск большего числа:");
        int number = 2;
        int number1 = 6;
        System.out.println(number + "," + number1);
        if (number == number1) {
            System.out.println("Числа равны");
        } else if (number1 < number) {
            System.out.println("Наибольшее число: " + number);
        } else {
            System.out.println("Наибольшее число: " + number1);
        }

        System.out.println();

        System.out.println("3.Проверка числа:");
        number = 8;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " " + "положительное чётное");
            } else if (number % 2 != 0) {
                System.out.println(number + " " + "положительное нечётное");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println(number + " " + "отрицательное чётное");
            } else if (number % 2 != 0) {
                System.out.println(number + " " + "отрицательное нечётное");
            }
        } else if (number == 0) {
                System.out.println(number + " " + "равно нулю");
        }

        System.out.println();

        System.out.println("4. Поиск одинаковых цифр в числах:");
        int a = 123;
        int b = 223;
        System.out.println("Исходные цифры: " + a + "," + b);
        if (a == b) {
            System.out.println("Числа равны");
        } else {
            int ones1 = a % 10;
            int tens1 = a / 10 % 10;
            int hunds1 = a / 100 % 10;
            int ones2 = b % 10;
            int tens2 = b / 10 % 10;
            int hunds2 = b / 100 % 10;
            if (ones1 != ones2 && tens1 != tens2 && hunds1 != hunds2) {
                System.out.println("Нет совпадающих цифр, все разряды разные");
            } else {
                if (ones1 == ones2) System.out.println("Среди разрядов: единицы равны");
                if (tens1 == tens2) System.out.println("десятки равны");
                if (hunds1 == hunds2) System.out.println("сотни равны");
            }
        }

        System.out.println();

        System.out.println("5. Определение символа по его коду:");
        char code = '\u0057';
        if (code >= 'A' && code <= 'Z') {
            System.out.println(code + "-" + "большая буква");
        } else if (code >= 'a' && code <= 'z') {
            System.out.println(code + "-" + "маленькая буква");
        } else if (code >= '0' && code <= '9') {
            System.out.println(code + "-" + "цифра");
        } else {
            System.out.println(code + "ни буква ни цифра");
        }

        System.out.println();

        System.out.println("6.Подсчёт начисленных банком процентов:");
        float sum = 321123.59f;
        System.out.println("Сумма вклада:" + sum + " " + "рублей");
        if (sum < 100000) {
            System.out.println("Банк начислит:" + (sum * 0.05) + " " + "рублей");
            System.out.println("Итоговая сумма вклада:" + (sum + (sum * 0.05)) + " " + "рублей");
        } else if (sum >= 100000 && sum <= 300000) {
            System.out.println("Банк начислит:" + (sum * 0.07) + " " + "рублей");
            System.out.println("Итоговая сумма вклада:" + (sum + (sum * 0.07)) + " " + "рублей");
        } else if (sum > 300000) {
            System.out.println("Банк начислит:" + (sum * 0.1) + " " + "рублей");
            System.out.println("Итоговая сумма вклада:" + (sum + (sum * 0.1)) + " " + "рублей");
        }

        System.out.println();

        System.out.println("7.Определение оценки по предметам:");
        float history = 59f;
        float programming = 92f;
        float gpa = (2 + 5) / 2f;
        float averadgePersent = (history + programming) / 2f;
        if (history <= 60) {
            System.out.println("Оценка по истории-2");
        } else if (history > 60 && history < 73) {
                System.out.println("Оценка по истории-3");
        } else if (history >= 73 && history < 91) {
                System.out.println("Оценка по истории-4");
        } else if (history >= 91) {
                System.out.println("Оценка по истории-5");
        }
        if (programming <= 60) {
                System.out.println("Оценка по программированию-2");
        } else if (programming > 60 && programming < 73) {
            System.out.println("Оценка по программированию-3");
        } else if (programming >= 73 && programming < 91) {
            System.out.println("Оценка по программированию-4");
        } else if (programming >= 91) {
            System.out.println("Оценка по программированию-5");
        }
        System.out.println("Средний балл оценок -" + gpa);
        System.out.println("Средний процент по предметам -" + averadgePersent);

        System.out.println();

        System.out.println("8.Расчёт годовой прибыли:");
        float monthlySales = 13025.233f;
        float rentPrice = 5123.018f;
        float productionCost = 9001.729f;
        float annualProfit = monthlySales * 12 - (rentPrice * 12 + productionCost * 12);
        if (annualProfit > 0) {
            System.out.println("Прибыль за год:" + "+" + annualProfit + " " + "руб.");
        } else if (annualProfit < 0) {
            System.out.println("Прибыль за год:" + annualProfit + " " + "руб.");
        } else {
            System.out.println("Прибыль за год:" + annualProfit + " " + "руб.");
        }
    }
}
































































































