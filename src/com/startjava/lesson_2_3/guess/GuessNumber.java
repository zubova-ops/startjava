package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNum;
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int min = 1;
        randomNum = min + (int)(Math.random() * (99 + 1));
        System.out.println("Компьютер загадал число от 1 до 100, попробуйте угадать");
        boolean isTrue = true;
        while (isTrue) {
            isTrue = process(player1);
            if (!isTrue) {
                break;
            }
            isTrue = process(player2);
        }
    }

    public boolean process(Player player) {
        System.out.println(player.getName()  + " введите число:");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (number == randomNum) {
            System.out.println(player.getName() + " поздравляем, Вы победили! Компьютер загадал число " + randomNum);
            return false;
        }
        return true;
    }
}