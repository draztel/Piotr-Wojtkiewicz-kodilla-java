package com.kodilla.testing.shape;

public class Square implements Shape {

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        int a = 5;
        return a * a;
    }
}
