package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("1. Калькулятор");
        Scanner console = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите первое число:");
            double number1 = console.nextDouble();
            System.out.println("Введите знак операции (+, -, /, *, %, ^):");
            char operation = console.next().charAt(0);
            if (operation != '+' && operation != '-' && operation != '/' && operation != '*' && operation != '%' && operation != '^') {
                System.out.println("Ошибка: операция " + operation + " не поддерживается");
            } else {
                System.out.println("Введите второе число:");
                double number2 = console.nextDouble();

                double result = calculator.calculate(operation, number1, number2);
                System.out.println(number1 +" " +  operation +" " +  number2 + " = " + result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = console.next().toLowerCase();
        } while(answer.equals("yes"));
    }
}