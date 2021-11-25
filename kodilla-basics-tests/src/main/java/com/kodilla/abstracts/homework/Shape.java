package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int a;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public Shape(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    private int b;
    private int h;

    public abstract void surfaceArea();

    public abstract void perimeter();
}