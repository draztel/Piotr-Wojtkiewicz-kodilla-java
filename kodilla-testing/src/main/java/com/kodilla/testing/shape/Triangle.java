package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        int a = 12;
        int h = 11;
        return (a * h) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }
}
