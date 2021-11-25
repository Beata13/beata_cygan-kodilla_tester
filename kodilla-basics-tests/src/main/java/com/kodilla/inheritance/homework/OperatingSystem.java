package com.kodilla.inheritance.homework;

public class OperatingSystem {
    public OperatingSystem(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    private int yearOfProduction;

public void turnOn() {
    System.out.println("Turning on...");
}
public void turnOff() {
    System.out.println("Turning of...");
}


}
