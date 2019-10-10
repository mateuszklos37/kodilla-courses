package com.kodilla.spring.portfolio;

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
        toDoList.addTask("Move the Safety System components");
        //Then
        System.out.println("To do list: " + toDoList.getTask(0));
    }
    @Test
    public void testInProgressTaskAdd(){
        //When
        TaskList inProgress = board.getInProgressList();
        inProgress.addTask("Resolving Weldguide communication problem");
        //Then
        System.out.println("In progress list: " + inProgress.getTask(0));
    }
    @Test
    public void testDoneTaskAdd(){
        //When
        TaskList doneList = board.getDoneList();
        doneList.addTask("Crew training");
        //Then
        System.out.println("Done list: " + doneList.getTask(0));
    }
}
