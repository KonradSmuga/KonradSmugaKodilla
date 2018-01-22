package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "square";
    private int field = 16;
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }
}
