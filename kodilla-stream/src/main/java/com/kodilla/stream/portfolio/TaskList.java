package com.kodilla.stream.portfolio;
import java.util.List;
import java.util.LinkedList;

public class TaskList {
    private final List<Task> tasks = new LinkedList<>();
    private final String name;

    public TaskList(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public boolean removeTask(Task task){
        return tasks.remove(task);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "name='" + name + '\'' + ",\n" +
                "tasks=\n" + tasks + "\n" +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList)) return false;
        TaskList taskList = (TaskList) o;
        return name.equals(taskList.name);
    }
}
