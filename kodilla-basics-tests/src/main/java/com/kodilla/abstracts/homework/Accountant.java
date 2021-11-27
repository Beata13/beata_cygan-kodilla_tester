package com.kodilla.abstracts.homework;

public class Accountant extends Job{
    public Accountant() {
        super(3500, "Passing an accounts");
    }

    @Override
    public void jobCharacteristic() {
        System.out.println(getSalary() + getResponsibilities());

    }
}
