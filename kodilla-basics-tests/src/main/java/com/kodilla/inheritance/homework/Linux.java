package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int yearOffProduction) {
        super(yearOffProduction);
        System.out.println("Linux constructor");
    }
    public void helloLinux() {
        System.out.println("Linux is saying hello");
    }

    public void linuxInformation() {
        System.out.println("Year of production yours version of Linux is");
    }

    @Override
    public void turnOn() {
        super.turnOn();
        {
            System.out.println("Turning on in");
        }
    }
}

