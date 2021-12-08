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


    }

    @Override
    public void decreaseSpeed() {

    }
}