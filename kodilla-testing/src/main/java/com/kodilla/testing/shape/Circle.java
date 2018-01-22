package com.kodilla.testing.shape;

public class Circle implements Shape {
        private String name = "circle";
        private int field = 14;
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }
}
