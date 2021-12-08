package com.kodilla.collections.interfaces.homework;


public class Opel implements Car {
    public Opel(int speed) {
        this.speed = speed;
    }

    int speed;

    @Override
    public int getSpeed() {
       return speed;
    }

    @Override
    public void increaseSpeed() {
speed = speed + 10;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;
    }
}