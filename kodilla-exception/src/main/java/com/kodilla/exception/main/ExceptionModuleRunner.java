package com.kodilla.exception.main;
import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.FirstChallenge;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException exception){
            System.out.println("Do not divide by 0!");
        }
        finally {
            System.out.println("Insert the next step...");
        }

    }
}
