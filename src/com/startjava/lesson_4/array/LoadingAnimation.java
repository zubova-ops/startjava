package com.startjava.lesson_4.array;

public class LoadingAnimation {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws InterruptedException {
        char[] spinnerSymbols = {'-', '\\', '|', '/' };
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < spinnerSymbols.length; k++) {
                System.out.print("Haking: " + spinnerSymbols[k]);
                System.out.print('\r');
                Thread.sleep(500);
            }
        }
        System.out.print('\r');
        int randomNum =  (int) (Math.random() * (98 + 1));
        if (randomNum > 70) {
            System.out.print(ANSI_RED + "Access Granted!" + ANSI_RESET);
        } else {
            System.out.print(ANSI_YELLOW + "Access Denied!" + ANSI_RESET);
        }
    }
}
