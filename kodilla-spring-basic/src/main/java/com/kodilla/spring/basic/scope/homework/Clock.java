package com.kodilla.spring.basic.scope.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        System.out.println(LocalDate.now());
    }
}
