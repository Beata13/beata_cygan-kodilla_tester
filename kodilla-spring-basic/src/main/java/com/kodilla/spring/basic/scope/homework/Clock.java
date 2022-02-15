package com.kodilla.spring.basic.scope.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {
    LocalTime time = LocalTime.now();
    public LocalTime Clock() {

        return time;
    }
}
