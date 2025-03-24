package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Вывод характеристик компьютера:");

        byte numberCores = 2;
        System.out.println("Количество ядер = " + numberCores);
        float cpuFrequency = 2.2F;
        System.out.println("Частота процессора = " + cpuFrequency + " " + "ггц");
        short memory = 6;
        System.out.println("Установленная память = " + memory + " " + "ГБ");
        long systemType = 64L;
        System.out.println("Тип системы" + " " + systemType + " " + "- разрядная операционная система");
        int windows = 10;
        System.out.println("Версия Windows" +  " " + windows);
        char cpu = 'B';
        int cpu1 = 960;
        System.out.println("Процессор" +  " " + cpu + cpu1);
        double cpuFrequency1 = 2.2;
        System.out.println("Частота процессора = " + cpuFrequency1 + " " + "ггц");
        System.out.println();
        System.out.println();


        System.out.println("2.Расчет стоимости товара со скидкой");
        double pen = 105.5;
        double book = 235.83;
        int discount = 11;
        double priceNotDiscount = pen + book;
        double discountSum = ((pen + book) * discount) / 100;
        double priceDiscount = priceNotDiscount - discountSum;
        System.out.println("Стоимость без скидки = " + " " + priceNotDiscount);
        System.out.println("Сумма скидки = " + " " + discountSum);
        System.out.println("Стоимость со скидкой = " + " " +  priceDiscount);
        System.out.println();
        System.out.println();



        System.out.println("3.Вывод слова JAVA");

        System.out.println(" " + " " + " " + "J" + " " + " " + " " + " " + "a" + " " + " " + "v" + " " + " " + " " + " " + " " + "v" + " " + " " + "a");
        System.out.println(" " + " " + " " + "J" + " " + " " + " " + "a" + " " + "a" + " " + " " + "v" + " " + " " + " " + "v" + " " + " " +"a" + " " + "a");
        System.out.println("J" + " " + " " + "J" + " " + " " + "aaaaa" + " " + " " + "V" + " " + "V" + " " + " " + "aaaaa");
        System.out.println(" " + "JJ" + " " + " " + "a" + " " + " " + " " + " " + " " + "a" + " " + " " + "V" + " " + " " + "a" + " " + " " + " " + " " + " " + "a");
        System.out.println();
        System.out.println();


        System.out.println("4.Вывод min и max значений целых числовых типов");
        byte min = - 128;
        byte max = 127;
        System.out.println("byte min:" + min);
        System.out.println("byte max:" + max);
        System.out.println("byte min++:" + ++min);
        System.out.println("byte max++:" + ++max);
        System.out.println("bytemin--:" + --min);
        System.out.println("byte max--:" + --max);
        System.out.println();

        short min1 = - 32728;
        short max1 = 32767;
        System.out.println("short min:" + min1);
        System.out.println("short max:" + max1);
        System.out.println("short min++:" + ++min1);
        System.out.println("short max++:" + ++max1);
        System.out.println("short min--:" + --min1);
        System.out.println("short max--:" + --max1);
        System.out.println();

        int min2 = - 2147483648;
        int max2 =   2147483647;
        System.out.println("int min:" + min2);
        System.out.println("int max:" + max2);
        System.out.println("int min++:" + ++min2);
        System.out.println("int max++:" + ++max2);
        System.out.println("int min--:" + --min2);
        System.out.println("int max--:" + --max2);
        System.out.println();

        long min3 = - 9223372036854775808L;
        long max3 =  9223372036854775807L;
        System.out.println("long min:" + min3);
        System.out.println("long max:" + max3);
        System.out.println("long min++:" + ++min3);
        System.out.println("long max++:" + ++max3);
        System.out.println("long min--:" + --min3);
        System.out.println("long max--:" + --max3);
        System.out.println();
        System.out.println();



        System.out.println("5.Перестановка значений переменных");
        int number = 2;
        int number1 = 5;
        System.out.println("Исходные значения переменных:" + number + "," + number1);
        System.out.println();

        int temp = number;
        number = number1;
        number1 = temp;
        System.out.println("С помощью третьей переменной:" + number + "," + number1);
        System.out.println();

        number = number + number1;
        number1 = number - number1;
        number = number - number1;
        System.out.println("С помощью арифметических операций:" + number + "," + number1);
        System.out.println();

        number = number ^ number1;
        number1 = number1 ^ number;
        number = number ^ number1;
        System.out.println("C помощью побитовой операции ^:" + number + "," + number1);
        System.out.println();
        System.out.println();
            
        System.out.println("6.Вывод символов и их кодов");
        char dollar = '$';
        int dollarCode = 36;
        System.out.println(dollar);
        System.out.println(dollarCode);
        System.out.println();

        char asteriks = '*';
        int asteriksCode = 42;
        System.out.println(asteriks);
        System.out.println(asteriksCode);
        System.out.println();

        char atSign = '@';
        int atSignCode = 64;
        System.out.println(atSign);
        System.out.println(atSignCode);
        System.out.println();

        char verticalBar = '\\';
        int verticalBarCode = 124;
        System.out.println(verticalBar);
        System.out.println(verticalBarCode);
        System.out.println();

        char tilde = '~';
        int tildeCode = 126;
        System.out.println(tilde);
        System.out.println(tildeCode);
        System.out.println();


        System.out.println("7.Вывод в консоль ASCII-арт Дюка");
        char a = '/';
        char b = '\\';
        char c = '_';
        char d = '(';
        char e = ')';
        System.out.println(" " + " " + " " + " " + a + b);
        System.out.println(" " + " " + " " + a + " " + " " + b);
        System.out.println(" " + " " + a + c + d + " " + e + b);
        System.out.println(" " + a + " " + " " + " " + " " + " " + " " + b);
        System.out.println("" + a + c + c + c + c + a + b + c + c + b);
        System.out.println();
        System.out.println();

        System.out.println("8.Манипуляции с сотнями десятками и единицами числа");
        int numb = 123;
        int hundred = numb / 100;
        int ten = numb / 10 % 10;
        int unit = numb % 10;
        int multiplication = hundred * ten * unit;
        int sum = hundred + ten + unit;
        System.out.println("Число 123 содержит:");
        System.out.println(hundred + " - сотню");
        System.out.println(ten + " - десятка");
        System.out.println(unit + " - единицы");
        System.out.println("Сумма разрядов = " + sum);
        System.out.println("Произведение разрядов = " + multiplication);
        System.out.println();
        System.out.println();

        System.out.println("9.Перевод секунд в часы, минуты и секунды");
        int time = 86399;
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}