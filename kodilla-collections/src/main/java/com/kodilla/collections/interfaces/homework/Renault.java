package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Renault implements Car {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renault renault = (Renault) o;
        return speed == renault.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

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

    @Override
    public String toString() {
        return "Renault{" +
                "speed=" + speed +
                '}';
    }
}
