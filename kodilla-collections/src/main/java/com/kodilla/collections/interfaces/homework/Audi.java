package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    public Audi(int speed) {
        this.speed = speed;
    }

    int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
speed = speed + 15;

    }

    @Override
    public void decreaseSpeed() {
speed = speed-10;
    }
}






