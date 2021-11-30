package com.kodilla.abstracts.homework;

public class Person {
   public String Firstname;

    public Person(String firstname, int age) {
        Firstname = firstname;
        this.age = age;
    }

    public int age;
public Job job;
public void jobResponsibilities (Job job){
    System.out.println(Firstname + age + job.getResponsibilities());

}


}
