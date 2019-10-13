package com.kodilla.patterns.factory.task;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
