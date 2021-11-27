package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(10,5);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface area of triangle is" + area);

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of triangle is" + perimeter);

    }
}