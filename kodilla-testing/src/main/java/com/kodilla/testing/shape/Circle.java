package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        int r = 4;
        double pi = 3.14;
        return pi * (r * r);
    }

    @Override
    public String toString() {
        return "Circle{}";
    }
}
