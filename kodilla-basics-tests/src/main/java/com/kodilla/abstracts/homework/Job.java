package com.kodilla.abstracts.homework;

public abstract class Job {
    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    int salary;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    String responsibilities;
    }

