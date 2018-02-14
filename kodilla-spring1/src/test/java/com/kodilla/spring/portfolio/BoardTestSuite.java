package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addToDoList("Nauka spring");
        board.addDoneList("Nauka podstaw java");
        board.addInProgressList("Wzorce projektowe");

        List<String> task = board.getToDoList().getTasks();
        List<String> task1 = board.getDoneList().getTasks();
        List<String> task2 = board.getInProgressList().getTasks();

        //then
        Assert.assertEquals("Nauka spring", task.get(0));
        Assert.assertEquals("Nauka podstaw java", task1.get(0));
        Assert.assertEquals("Wzorce projektowe", task2.get(0));
    }
}