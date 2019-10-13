package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task createTask(String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("It's a shopping task", "Buy a lot of chocolate", 10);
            case PAINTINGTASK:
                return new PaintingTask("It's a painting task", "Blue", "All walls");
            case DRIVINGTASK:
                return new DrivingTask("It's a driving task", "To Madrid", "Plane");
            default:
                return null;
        }
    }
}