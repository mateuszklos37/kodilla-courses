package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements ObserverI{
    private String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
        count = 0;
    }

    @Override
    public void update(StudentsExercises studentsExercises){
        System.out.println(name + ": received a new exercise to check!" + "\n"
        + "Total exercises from: " + studentsExercises.getStudentsName() + ": " + studentsExercises.getExercises().size());
        count ++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
