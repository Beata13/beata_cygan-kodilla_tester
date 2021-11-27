package com.kodilla.abstracts.homework;

public class Rectangle<area> extends Shape {
    public Rectangle() {
        super(10,6);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface area of rectangle is" + area);

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of rectangle is" + perimeter);

    }
}
