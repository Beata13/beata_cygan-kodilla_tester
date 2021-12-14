package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directors = new HashMap<>();
        Principal James = new Principal("James", "Woods");
        Principal Ann = new Principal("Anna", "Parker");
        Principal John = new Principal("John", "Peterson");
        School JamesSchool = new School(200);
        School AnnSchool = new School(300);
        School JohnSchool = new School(400);

        directors.put(James, JamesSchool);
        directors.put(Ann, AnnSchool);
        directors.put(John, JohnSchool);
        for (Map.Entry<Principal, School> principalSchoolEntry : directors.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFirstName() +
                    principalSchoolEntry.getValue());
    }
}

