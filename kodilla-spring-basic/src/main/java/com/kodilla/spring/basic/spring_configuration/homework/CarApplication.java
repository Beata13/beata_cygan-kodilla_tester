package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarApplication {
    @Bean
    public Car getCarType() {
        Car car;
        LocalDate month = LocalDate.now();
        int monthNumber = month.getMonthValue();

        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            car = new SUV();

        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            car = new Cabrio();

        } else {
            car = new Sedan();
        }
        return car;
    }


}

