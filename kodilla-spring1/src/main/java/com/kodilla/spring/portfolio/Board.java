package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList addToTaskToDoList(String taskTitle) {

        return new TaskList();
    }

    public TaskList addToTaskInProgressList(String taskTitle) {

        return new TaskList();
    }

    public TaskList addToTaskDoneList(String taskTitle) {

        return new TaskList();
    }
}
