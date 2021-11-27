package com.kodilla.abstracts.homework;

public class Nurse extends Job {

    public Nurse() {
        super(2500, "Checking blood pressure");
    }

    @Override
    public void jobCharacteristic() {
        System.out.println(getSalary() + getResponsibilities());
    }
}
