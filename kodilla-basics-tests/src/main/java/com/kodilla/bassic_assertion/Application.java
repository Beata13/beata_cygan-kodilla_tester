package com.kodilla.bassic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);

        int raisingResult = calculator.raising(a);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean accurate = ResultChecker.assertEquals(-3, subtractResult);
        if (accurate) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean check = ResultChecker.assertEquals(25, raisingResult);
        if (check) {
            System.out.println("Metoda potęgowania działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda potęgowania nie działa poprawnie dla liczby " + a );
        }

    }
}