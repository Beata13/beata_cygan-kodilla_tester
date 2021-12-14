package com.kodilla.collections.adv.maps;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;
import com.kodilla.collections.adv.maps.homework.Principal;
import com.kodilla.collections.adv.maps.homework.School;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);
        Double grade = grades.get("Mathematics");
        System.out.println(grade);
        for (Map.Entry<String, Double> note : grades.entrySet()) {
            System.out.println("Grade of " + note.getKey() + " is equal to " + note.getValue());
        }
    }
}
