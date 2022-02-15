package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
        class CarApplicationTestSuite {
            @Test
            public void shouldChooseCorrectCar() {
                ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
                Car car = (Car) context.getBean("whichCarIsInUse");
                String carType = car.getCarType();
                System.out.println(carType);
                List<String> possibleCarType = Arrays.asList("SUV", "Cabrio", "Sedan" );
                Assertions.assertTrue(possibleCarType.contains(carType));


            }
            @Test
            public void shouldTurnOffLights() {
                ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("LightsTurnOnAndOff");
        boolean lightsStatus = car.hasHeadlightsTurnedOn();
        Assertions.assertFalse(lightsStatus);

    }
    }