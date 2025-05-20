package com.startjava.lesson_4.array;

public class ReverseBankingTransactions {
    public static void main(String[] args) {
        customerTransactions(new int[0]);
        customerTransactions(null);
        customerTransactions(new int[]{5});
        customerTransactions(new int[]{6, 8, 9, 1});
        customerTransactions(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    public static void customerTransactions(int[] sumCustomerTransactions) {
        if (sumCustomerTransactions == null) {
            System.out.println("Ошибка данных");
        } else if (sumCustomerTransactions.length == 0) {
            System.out.println(("Нет транзакций"));
        } else {
            int[] copySumCustomerTransactions = new int[sumCustomerTransactions.length];
            System.arraycopy(sumCustomerTransactions, 0, copySumCustomerTransactions, 0, sumCustomerTransactions.length);

            for (int i = 0; i < copySumCustomerTransactions.length / 2; i++) {
                int start = 0;
                int end = copySumCustomerTransactions.length - 1;
                while (start < end) {
                    int temp = copySumCustomerTransactions[start];
                    copySumCustomerTransactions[start] = copySumCustomerTransactions[end];
                    copySumCustomerTransactions[end] = temp;
                    start++;
                    end--;
                }
            }
            System.out.print("\nИсходные транзакции: [");
            printToDisplay(sumCustomerTransactions);
            System.out.print("\nВ обратном порядке: [");
            printToDisplay(copySumCustomerTransactions);
        }
    }

    private static void printToDisplay(int[] copySumCustomerTransactions) {
        for (int i = 0; i < copySumCustomerTransactions.length; i++) {
            if (i == copySumCustomerTransactions.length - 1) {
                System.out.print(copySumCustomerTransactions[i]);
            } else {
                System.out.print(copySumCustomerTransactions[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
