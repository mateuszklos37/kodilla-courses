package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(){
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public List<String> addTask(String task){
        tasks.add(task);
        return tasks;
    }

    public String getTask(int index){
        return tasks.get(index);
    }
}
