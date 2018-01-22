package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;


public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {

        figures.add(shape);
    }

    public void removeFigure(Shape shape) {

        figures.remove(shape);
    }

    public Shape getFigure(int n) {

        return figures.get(n);
    }

    public void showFigures() {

        System.out.println(figures);
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "figures=" + figures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(figures, that.figures);
    }

    @Override
    public int hashCode() {

        return Objects.hash(figures);
    }
}

