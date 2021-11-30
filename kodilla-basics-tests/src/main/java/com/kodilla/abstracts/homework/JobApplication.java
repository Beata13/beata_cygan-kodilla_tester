package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[]args){
Person Ann = new Person("Anna", 30);
Person Mathew = new Person ("Mathew", 40);
Person Jimmie = new Person ("Jimmie", 28);
 Job cook = new Cook();
 Job nurse = new Nurse();
 Job accountant = new Accountant();

Ann.jobResponsibilities(accountant);
Mathew.jobResponsibilities(cook);
Jimmie.jobResponsibilities(nurse);
}

}
