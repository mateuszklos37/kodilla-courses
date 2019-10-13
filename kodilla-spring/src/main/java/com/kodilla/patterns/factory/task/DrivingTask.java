package com.kodilla.patterns.factory.task;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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

    public String getWhere(){
        return where;
    }

    public String getUsing() {
        return using;
    }

    public boolean isTaskExecuted(){
        if (this.taskExecuted == true)
            return true;
        else
            return false;
    }
}