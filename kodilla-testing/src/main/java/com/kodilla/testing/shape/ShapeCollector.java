package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector() {
    }

    public int shapesSize() {
        return shapes.size();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public String getFigure(int n) {
        return shapes.get(n).getShapeName();
    }

    public String showFigures() {
        String shapeNames = "";
        for(Shape shape: shapes) {
            shapeNames += shape.getShapeName();
        }
        return shapeNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(shapes, that.shapes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapes);
    }

}
