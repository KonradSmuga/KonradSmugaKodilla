package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testInformMentor() {
        //Given
        Mentor mateusz = new Mentor("Mateusz");
        Mentor dawid = new Mentor("Dawid");

        TaskQueue konrad = new TaskHome();
        TaskQueue karolina = new TaskHome();
        TaskQueue max = new TaskWork();
        TaskQueue alicja = new TaskWork();

        konrad.registerObserver(mateusz);
        karolina.registerObserver(mateusz);
        max.registerObserver(dawid);
        alicja.registerObserver(dawid);

        //When
        konrad.addTask("learn observer at home");
        karolina.addTask("learn facade at home");
        max.addTask("learn observer at work");
        alicja.addTask("learn facade at wor");

        //Then
        assertEquals(2, mateusz.getTaskCounter());
        assertEquals(2, dawid.getTaskCounter());
    }
}
