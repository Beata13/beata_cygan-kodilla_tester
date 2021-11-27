package com.kodilla.abstracts.homework;

public class Cook extends Job {
    public Cook() {
        super(4000,"Making dishes");

    }

    @Override
    public void jobCharacteristic() {
        System.out.println(getSalary() + getResponsibilities());

    }
}
