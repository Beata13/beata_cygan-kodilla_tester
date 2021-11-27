package com.kodilla.abstracts.homework;

public abstract class Job {
    public Job() {

    }

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    private int salary;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    private String responsibilities;


public abstract void jobCharacteristic();
}
