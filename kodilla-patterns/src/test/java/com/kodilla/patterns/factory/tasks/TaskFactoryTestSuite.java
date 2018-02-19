package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //then
        Assert.assertEquals("Driving Task", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
    @Test
    public void testPaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //then
        Assert.assertEquals("Painting Task", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());

    }
    @Test
    public void testShopingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }
}
