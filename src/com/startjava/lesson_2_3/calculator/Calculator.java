package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public double calculate(char operation, double number1, double number2) {
        double result = 0;
        switch(operation) {
            case '+' :
            result = number1 + number2;
            break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' :
                result = number1 * number2;
                break;
            case '/' :
                if (number2 == 0) {
                    System.out.println("Ошибка! На ноль делить нельзя!");
                } else {
                    result = number1 / number2;
                    break;
                }
            case '%' :
                result = number1 % number2;
                break;
            case '^' :
                if (number2 < 0) {
                    result = Math.pow(number1, number2);
                } else {
                    result = 1;
                    for (int i = 1; i <= number2; i++) {
                        result = result * number1;
                    }
                }
                break;
            default:
                System.out.println("Ошибка: операция " + operation + " не поддерживается");
        }
        return result;
    }
}