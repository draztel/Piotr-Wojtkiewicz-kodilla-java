package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {
    String shapeNames = "";
    String aBreak = " ";
    public Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public ArrayList<Shape> shapes = new ArrayList<Shape>();

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
        for(int i=0; i<shapes.size(); i++) {
            shapeNames += getFigure(i) + aBreak;
        }
        return shapeNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(shapes, that.shapes) &&
                Objects.equals(shape, that.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapes, shape);
    }
}
