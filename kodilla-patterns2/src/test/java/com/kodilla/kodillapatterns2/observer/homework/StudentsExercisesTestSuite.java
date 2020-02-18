package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentsExercisesTestSuite {
    @Test
    public void testStudentsExercises(){
        //Given
        StudentsExercises mateoKlos = new StudentsExercises("Mateusz Kłos");
        StudentsExercises thomasShelby = new StudentsExercises("Thomas Shelby");
        StudentsExercises donPablo = new StudentsExercises("Pablo Escobar");
        StudentsExercises donFelix = new StudentsExercises("Miguel Angel Felix");
        Mentor donRafa = new Mentor("Rafa");
        Mentor michaelCorleone = new Mentor("Michael Corleone");
        mateoKlos.registerObserver(donRafa);
        thomasShelby.registerObserver(donRafa);
        donPablo.registerObserver(michaelCorleone);
        donFelix.registerObserver(michaelCorleone);
        //When
        mateoKlos.addExercise("24.4");
        mateoKlos.addExercise("24.3");
        mateoKlos.addExercise("Last project");
        thomasShelby.addExercise("Team project");
        thomasShelby.addExercise("24.4");
        donPablo.addExercise("24.4");
        donFelix.addExercise("24.4");
        //Then
        assertEquals(5, donRafa.getCount());
        assertEquals(2, michaelCorleone.getCount());
    }
}
