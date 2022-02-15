package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarApplication {
    @Bean
    public Car getCarType() {
        Car car;
        Random generator = new Random();
        int season = generator.nextInt(5);
        if (season == 1) {
            car = new SUV();
            return car;
        } else if (season == 2) {
            car = new Cabrio();
            return car;
        } else {
            car = new Sedan();
        }
        return car;
    }

    @Bean
    public boolean LightsTurnOnAndOff() {
        Car car;
        LocalTime time = LocalTime.now();
        LocalTime startTime = LocalTime.parse("06:00:00");
        LocalTime stopTime = LocalTime.parse("20:00:00");
        if (time.isAfter(startTime) && time.isBefore(stopTime)) ;
        {
            return false;
        }
    }
}

