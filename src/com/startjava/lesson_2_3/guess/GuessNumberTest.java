package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class  GuessNumberTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        String name1 = console.nextLine();
        System.out.println("Введите имя второго игрока:");
        String name2 = console.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer;
        do {
            guessNumber.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = console.next().toLowerCase();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}