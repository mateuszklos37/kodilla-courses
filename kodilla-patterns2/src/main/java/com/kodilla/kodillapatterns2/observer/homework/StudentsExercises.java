package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StudentsExercises implements ObservableI{
    private final String studentsName;
    private final List<ObserverI> observers;
    private final ArrayDeque<String> exercises;

    public StudentsExercises(String studentsName){
        this.studentsName = studentsName;
        observers = new ArrayList<>();
        exercises = new ArrayDeque<>();
    }

    public void addExercise(String exercise){
        exercises.offer(exercise);
        notifyObserver();
    }

    @Override
    public void registerObserver(ObserverI observerI){
        observers.add(observerI);
    }
    @Override
    public void notifyObserver(){
        for (ObserverI observerI: observers){
            observerI.update(this);
        }
    }
    @Override
    public void removeObserver(ObserverI observerI){
        observers.remove(observerI);
    }

    public ArrayDeque<String> getExercises() {
        return exercises;
    }

    public String getStudentsName() {
        return studentsName;
    }
}
