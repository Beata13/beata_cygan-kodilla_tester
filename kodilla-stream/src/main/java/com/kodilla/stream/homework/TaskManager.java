package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {

        List<LocalDate> dates;
        dates = (List<LocalDate>) TaskRepository.getTasks()
                .stream()
                .filter (u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(TaskManager::getDeadline)
                .collect(Collectors.toList());
        System.out.println(dates);
    }

    public static LocalDate getDeadline(Task deadline)
    {
        return deadline.getDeadline();
    }


}