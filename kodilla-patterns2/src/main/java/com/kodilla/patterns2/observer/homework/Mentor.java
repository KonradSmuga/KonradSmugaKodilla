package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int taskCounter;

    public Mentor(String name) {

        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {



    }

    public String getName() {
        return name;
    }

    public int getTaskCounter() {
        return taskCounter;
    }
}
