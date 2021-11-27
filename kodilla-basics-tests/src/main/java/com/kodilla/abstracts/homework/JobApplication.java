package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Cook cook = new Cook();
        Nurse nurse = new Nurse();
        Person Marcin = new Person("Marcin", 30, cook.getResponsibilities());
        Person Agnieszka = new Person("Agnieszka", 25, nurse.getResponsibilities());
        Person Monika = new Person ("Monika",28, accountant.getResponsibilities());

   Marcin.jobCharacteristic();
   Agnieszka.jobCharacteristic();
   Monika.jobCharacteristic();
    }
}
