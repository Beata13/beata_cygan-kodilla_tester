package com.kodilla.spring.basic.spring_configuration.homework;

import java.util.Random;

public class SUV implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
      return true;
    }


    @Override
    public String getCarType() {
        return null;
    }
}