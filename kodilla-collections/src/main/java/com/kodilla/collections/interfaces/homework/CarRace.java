package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(5);

        Opel opel = new Opel(10);
        Renault renault = new Renault(15);

doRace(audi);
doRace(opel);
doRace(renault);
    }

    private static void doRace(Car car) {
car.increaseSpeed();
car.increaseSpeed();
car.increaseSpeed();
car.decreaseSpeed();
car.decreaseSpeed();
car.getSpeed();





    } }