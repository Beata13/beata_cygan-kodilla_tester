package com.kodilla.abstracts.homework;

public class Person extends Job {
    String firstName;
    int age;


    public Person(String firstName, int age, String job) {
        super();
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    String job;
    Cook cook = new Cook();
    Nurse nurse = new Nurse();
    Accountant accountant = new Accountant();


    @Override
    public void jobCharacteristic() {
        System.out.println(firstName + age + getResponsibilities());
    }
}
