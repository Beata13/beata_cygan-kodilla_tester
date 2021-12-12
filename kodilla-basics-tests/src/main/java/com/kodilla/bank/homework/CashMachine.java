package com.kodilla.bank.homework;

public class CashMachine {
    public int[] getTransaction() {
        return transaction;
    }

    private int[] transaction;
    private int size;

    public CashMachine() {
        this.transaction = new int[0];
        this.size = 0;

    }


    public int getSize() {
        return size;
    }

    public CashMachine addTransaction(int value) {
        this.size++;
        int[] newTransaction = new int[this.size];
        System.arraycopy(transaction, 0, newTransaction, 0, transaction.length);

        newTransaction[(this.size - 1)] = value;
        this.transaction = newTransaction;


        return null;
    }

    public int sumTransaction() {
        int result = 0;
        for (int tx : transaction) {
            result = result + tx;
        }
        return result;
    }

    public int countPositiveTransactions() {
        int result = 0;
        for (int tx : transaction) {

            if (tx > 0) {
                result++;
            }
        }
        return result;

    }

    public int countNegativeTransactions() {
        int result = 0;
        for (int tx : transaction) {

            if (tx < 0) {
                result++;
            }
        }
        return result;
    }

    public double getAveragePositiveTransactions() {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < this.size; i++) {
            if (this.transaction[i] > 0) {
                sum += this.transaction[i];
                count++;
            }

        }

        return sum / count;
    }

    public double getAverageNegativeTransactions() {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.transaction[i] < 0) {
                sum += this.transaction[i];
count++;
            }

        }
        return (sum / count) * -1;
    }
}
