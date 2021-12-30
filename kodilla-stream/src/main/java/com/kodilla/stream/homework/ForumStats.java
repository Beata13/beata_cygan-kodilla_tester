package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()

                .stream()
                .filter(u -> u.getAge()>40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}