package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n=0; n< cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int speedIncreaser = random.nextInt() * 100 + 1;

        if (drawnCarKind == 0)
            return new Renault(drawCar().getSpeed() + speedIncreaser);
        else if (drawnCarKind ==1)
            return new Opel(drawCar().getSpeed() + speedIncreaser);
        else return new Audi(drawCar().getSpeed() + speedIncreaser);
    }
}
