package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        //first test
        SimpleUser simpleUser = new SimpleUser("Example");

        String result = simpleUser.getUsername();

        if (result.equals("Example")){
            System.out.println("Test ok");
        }
        else{
            System.out.println("Wrong name");
        }
        //second test
        Calculator calculator1 = new Calculator();

        int addingRes = calculator1.add(3, 2);
        if (addingRes == calculator1.addingResult) {
            System.out.println("Adding test ok");
        }
        else{
            System.out.println("Adding test failed: wrong result");
        }

        int subtactingRes = calculator1.subtract(3, 2);
        if (subtactingRes == calculator1.addingResult) {
            System.out.println("Subtracting test ok");
        }
        else{
            System.out.println("Subtracting test failed: wrong result");
        }
    }
}
