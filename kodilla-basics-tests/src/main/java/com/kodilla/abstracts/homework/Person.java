package com.kodilla.abstracts.homework;

public class Person {
   public String Firstname;

    public Person(String firstname, int age, Job job) {
        Firstname = firstname;
        this.age = age;
        this.job = job;
    }

   public int age;
   public Job job;

public void personResponsibilities() {
    System.out.println(Firstname + age  + job );
}

}
