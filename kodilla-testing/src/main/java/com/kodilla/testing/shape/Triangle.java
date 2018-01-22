package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name = "triangle";
    private int field = 10;
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }
}
