package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length).forEach(System.out::println);
        double average = IntStream.range(0, numbers.length)
                .map (n ->5)
                .average().getAsDouble();
        System.out.println("Average value is: " + average);
        return average;
    };
}
