package com.kodilla.abstracts.homework;

public abstract class Shape {

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public Shape(int area, int perimeter) {

        this.area = area;
        this.perimeter = perimeter;
    }

int area;
int perimeter;

    public abstract void surfaceArea();


    public abstract void perimeter();

}
