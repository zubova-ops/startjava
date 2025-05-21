package com.startjava.lesson_4.array;

public class LoadingAnimation {
    public static void main(String[] args) throws InterruptedException {
        char[] spinnerSymbols = {'-', '\\', '|', '/' };
        for (int i = 1; i <= 3; i++) {
            for (int z = 0; z < spinnerSymbols.length; z++) {
                System.out.print("Haking: " + spinnerSymbols[z]);
                System.out.print('\r');
                Thread.sleep(500);
            }
        }
        System.out.print('\r');
        int min = 0;
        int randomNum = min + (int) (Math.random() * (98 + 1));
        if (randomNum > 70) {
            System.out.print("Access Granted!");
        } else {
            System.out.print("Access Denied!");

        }

    }
}
