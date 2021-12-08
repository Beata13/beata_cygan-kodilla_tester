package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {
    public Renault(int speed) {
        this.speed = speed;
    }

    int speed;

    @Override
    public int getSpeed() {
      return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 50;
    }



    @Override
    public void decreaseSpeed() {
       speed = speed -15;

    }
}
