package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int taskCounter;

    public Mentor(String name) {

        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": New messages in topic " + taskQueue.getTaskName() + "\n" +
                " (total: " + taskQueue.getTaskList().size() + " tasks)");
        taskCounter++;
    }

    public String getName() {
        return name;
    }

    public int getTaskCounter() {
        return taskCounter;
    }
}
