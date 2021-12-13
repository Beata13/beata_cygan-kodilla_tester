package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Renault> cars = new ArrayList<>();
        Renault renaultt = new Renault(100);
cars.add(renaultt);
        cars.add(new Renault(100));
        cars.add(new Renault(50));
        cars.add(new Renault(140));
        cars.remove(1);
        cars.remove(renaultt);
        System.out.println(cars.size());
        for (Renault renault : cars) {
            CarUtils.describeCar(renault);
        }
    }
}
