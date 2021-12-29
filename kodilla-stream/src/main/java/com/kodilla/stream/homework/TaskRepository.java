package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List <Task> tasks = new ArrayList<>();
        tasks.add(new Task("Cleaning room", LocalDate.of(2021, 12, 28),LocalDate.of(2021, 12,28)));
        tasks.add(new Task("Reading book", LocalDate.of(2022, 01, 01),LocalDate.of(2022, 01,01)));
        tasks.add(new Task("Do shopping", LocalDate.of(2021, 12, 31),LocalDate.of(2021, 12,31)));

    return tasks;
    }

}
