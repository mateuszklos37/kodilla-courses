package com.kodilla.patterns.factory.task;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPain;
    private boolean taskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPain) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPain = whatToPain;
    }

    public boolean executeTask(){
        if(taskExecuted == true){
            System.out.println("Task has already been executed");
            return taskExecuted;
        }
        else {
            return taskExecuted = true;
        }
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted(){
        if (this.taskExecuted == true)
            return true;
        else
            return false;
    }
}
