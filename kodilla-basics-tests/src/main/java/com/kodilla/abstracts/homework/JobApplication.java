package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[]args){

        Job cook = new Cook();
        Job nurse = new Nurse();
        Job accountant = new Accountant();


Person Ann = new Person("Anna", 30, cook);
Person Mathew = new Person ("Mathew", 40, nurse);
Person Jimmie = new Person ("Jimmie", 28, accountant);


Ann.jobResponsibilities();
Mathew.jobResponsibilities();
Jimmie.jobResponsibilities();
}

}
