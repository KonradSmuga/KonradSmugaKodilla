package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private static boolean executeTask = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName() {

        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("wykonaj zadanie: Shopping Task");
        this.executeTask = true;
    }

    @Override
    public boolean isTaskExecuted() {
        if (executeTask = true) {
            return true;

        }
        return false;
    }
}

