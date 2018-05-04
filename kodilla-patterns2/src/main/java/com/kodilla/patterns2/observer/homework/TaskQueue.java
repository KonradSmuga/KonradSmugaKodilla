package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final String taskName;
    private final List<Observer> mentors;
    private final List<String> taskList;

    public TaskQueue(String taskName) {
        taskList = new ArrayList<>();
        mentors = new ArrayList<>();
        this.taskName = taskName;
    }

    public void addTask(String task) {
        taskList.add(task);
        notifyObservers();
    }


    @Override
    public void registerObserver(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mentors) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Mentor mentor) {
        mentors.remove(mentor);
    }

    public String getTaskName() {
        return taskName;
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
