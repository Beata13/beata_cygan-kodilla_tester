package com.kodilla.bank.homework;

public class Bank {


    private CashMachine[] cashMachines;
    private int size;

    public Bank() {

        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void addNewCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newCashMachine = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newCashMachine, 0, cashMachines.length);

        newCashMachine[(this.size - 1)] = cashMachine;

        this.cashMachines = newCashMachine;
    }

    public int balance() {
        int result = 0;
        for (CashMachine machine : cashMachines) {
            result = result + machine.sumTransaction();
        }
        return result;
    }

    public int CashMachinesPositiveTransactions() {
        int result = 0;
        for (CashMachine machines : cashMachines) {
            result = result + machines.countPositiveTransactions();
        }
        return result;
    }

    public int CashMachinesNegativeTransactions() {
        int result = 0;
        for (CashMachine machines : cashMachines) {
            result = result + machines.countNegativeTransactions();

        }
        return result;
    }

    public double CashMachinesPosAverage() {
        double result = 0;
                for (CashMachine machines : cashMachines) {
            result = result + machines.getAveragePositiveTransactions();

        }
        return result;
    }

    public double CashMachinesNegAverage() {
        double result = 0;
        for (CashMachine machines : cashMachines) {
            result = result + machines.getAverageNegativeTransactions();
        }
        return result;
    }
}

