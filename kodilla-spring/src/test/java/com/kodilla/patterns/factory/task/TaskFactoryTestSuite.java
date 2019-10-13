package com.kodilla.patterns.factory.task;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("It's a driving task", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("It's a shopping task", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.PAINTINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("It's a painting task", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }
}
