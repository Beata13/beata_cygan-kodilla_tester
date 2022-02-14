package com.kodilla.spring.basic.scope.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    public LocalTime Clock() {
        return LocalTime.now();
    }
}
