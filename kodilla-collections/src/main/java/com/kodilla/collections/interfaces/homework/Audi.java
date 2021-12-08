package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    public Audi(int speed) {
        this.speed = speed;
    }

    int speed;

    @Override
    public void getSpeed() {
        System.out.println(speed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed + 20);

    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - 20);
    }
}






