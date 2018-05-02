package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final String userName;
    private final List<Observer> mentors;
    private final List<String> taskList;

    public TaskQueue(String userName) {
        taskList = new ArrayList<>();
        mentors = new ArrayList<>();
        this.userName = userName;
    }

    public void addTask(String task) {
        taskList.add(task);
        notifyObservers();
    }


    @Override
    public void registerObserver(Mentor mentor) {

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
}
