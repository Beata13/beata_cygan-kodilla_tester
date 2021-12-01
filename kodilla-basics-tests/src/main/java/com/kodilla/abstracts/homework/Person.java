package com.kodilla.abstracts.homework;

public class Person {
   public String Firstname;
    public int age;
    public Job job;
    public Person(String firstname, int age, Job job) {
        Firstname = firstname;
        this.age = age;
        this.job = job; }


public void jobResponsibilities (){
    System.out.println(Firstname + age + job.getResponsibilities());

}


}
