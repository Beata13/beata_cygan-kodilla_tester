package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {
    public Renault(int speed) {
        this.speed = speed;
    }

    int speed;

    @Override
    public void getSpeed() {
        System.out.println(speed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed + 50);

    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - 50);
    }
}
