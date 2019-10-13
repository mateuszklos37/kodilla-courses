package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    Board board;
    @Before
    public void before(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        this.board = context.getBean(Board.class);
    }

    @Test
    public void testToDoTaskAdd(){
        //When
        TaskList toDoList = board.getToDoList();
        toDoList.getTasks().add("Move the Safety System components");
        String toDoTask = toDoList.getTasks().get(0);
        //Then
        Assert.assertEquals("Move the Safety System components", toDoTask);
    }
    @Test
    public void testInProgressTaskAdd(){
        //When
        TaskList inProgress = board.getInProgressList();
        inProgress.getTasks().add("Resolving Weldguide communication problem");
        String inProgressTask = inProgress.getTasks().get(0);
        //Then
        Assert.assertEquals("Resolving Weldguide communication problem", inProgressTask);
    }
    @Test
    public void testDoneTaskAdd(){
        //When
        TaskList doneList = board.getDoneList();
        doneList.getTasks().add("Crew training");
        String doneTask = doneList.getTasks().get(0);
        //Then
        Assert.assertEquals("Crew training", doneTask);
    }
}
