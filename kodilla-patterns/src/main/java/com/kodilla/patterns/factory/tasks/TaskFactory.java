package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "Driving Task";
    public static final String PAINTINGTASK = "Painting Task";
    public static final String SHOPPINGTASK = "Shopping Task";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case PAINTINGTASK:
                return new PaintingTask("Painting Task", "white", "wall");
            case DRIVINGTASK:
                return new DrivingTask("Driving Task", "Warsaw", "car");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task", "paint", 2);

            default:
                return null;
        }
    }
}
