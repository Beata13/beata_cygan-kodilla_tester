package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarApplication {
    @Bean
    public Car whichCarIsInUse() {
        Car car;
        Random generator = new Random();
        int season = generator.nextInt(5);
        if (season == 1) {
            car = new SUV();
        } else if (season == 2) {
            car = new Cabrio();

        } else {
            car = new Sedan();
        }
        return car;
    }
//
//    @Bean
//    public boolean LightsTurnOnAndOff() {
//        Car car;
//        Random generator = new Random();
//        int hour = generator.nextInt(25);
//        if (hour >= 0 && hour <= 6) {
//            car.hasHeadlightsTurnedOn() == true;
//
//        }
//        if (hour >= 20 && hour <= 24) {
//            car.hasHeadlightsTurnedOn() == true;
//        } else {
//            return false;
//        }
//        return false;
//    }
}

