package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int yearOffProduction) {
        super(yearOffProduction);
        System.out.println("Windows constructor");
    }
    public void helloWindows() {
        System.out.println("Windows is saying hello");
    }

    public void windowsInformation() {
        System.out.println("Year of production Yours version of Windows is");
    }

    @Override
    public void turnOn() {
                {
            System.out.println("Turning on in");
        }
    }
}
