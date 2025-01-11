import java.util.Scanner;
public class FinalHomeWork {
    public static void main(String[] args) {
        System.out.println("1. Калькулятор");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = console.nextInt();
        System.out.println("Введите знак операции (+, -, /, *, %, ^)");
        char operation = console.next().charAt(0);
        System.out.println("Введите второе число");
        int number2 = console.nextInt();

        if (operation == '-') {
            int result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        }
        if (operation == '+') {
            int result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }
        if (operation == '*') {
            int result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        }
        if (operation == '/') {
            int result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
        if (operation == '%') {
            int result = number1 % number2;
            System.out.println(number1 + " % " + number2 + " = " + result);
        }
        if (operation == '^') {
            int result = 1;
            for (int i = 1; i <= number2; i++)
                result = result * number1;
            System.out.println(number1 + " ^ " + number2 + " = " + result);
        } else {
            System.out.println("Вы ввели неверные данные");
        }

        System.out.println("\n2. Игра. Угадай число");
        int min = 1; int max = 100;
        int randomNum = min + (int)(Math.random() * (99 + 1));
        System.out.println("Компьютер загадал число: " + randomNum);

         min = 1; max = 100;
        int playerRandomNum = min + (int)(Math.random() * (99 + 1));
        System.out.println("Ответ игрока: " + playerRandomNum);

        if (playerRandomNum > randomNum) {
            System.out.println(playerRandomNum + " больше того, что загадал компьютер");
            while (playerRandomNum != randomNum) {
                playerRandomNum --;
                System.out.println(playerRandomNum);
                if (playerRandomNum > randomNum) {
                    System.out.println(playerRandomNum + " больше того, что загадал компьютер");
                }
            }
        } else if (playerRandomNum < randomNum) {
                System.out.println(playerRandomNum + " меньше того, что загадал компьютер");
                while (playerRandomNum != randomNum) {
                    playerRandomNum++;
                    System.out.println(playerRandomNum);
                    if (playerRandomNum < randomNum) {
                        System.out.println(playerRandomNum + " меньше того, что загадал компьютер");
                    }
                }
            }
        if (playerRandomNum == randomNum) {
            System.out.println(playerRandomNum + " Вы победили!");
        }
    }
}