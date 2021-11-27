package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(4,4);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface area of square is" + area);

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of sqare is" + perimeter);

    }
}