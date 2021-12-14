package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> students = new ArrayList<>();
    public School(double... students) {
        for (double grade : students)
            this.students.add(grade);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
