package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan  implements  Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        LocalTime startTime = LocalTime.parse("06:00:00");
        LocalTime stopTime = LocalTime.parse("20:00:00");
        if (time.isAfter(stopTime) && time.isBefore(startTime)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {

        return "Sedan";
    }
}
