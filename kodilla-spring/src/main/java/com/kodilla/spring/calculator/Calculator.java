package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    public double add(double a, double b){
        double result = a+b;
        display.displayVal(result);
        return result;
    }
    public double sub(double a, double b){
        double result = a-b;
        display.displayVal(result);
        return result;
    }
    public double mul(double a, double b){
        double result = a*b;
        display.displayVal(result);
        return result;
    }
    public double div(double a, double b){
        double result = a/b;
        if(b==0){
            b=1;
            System.out.println("b changed automatically to 1 - do not divide by 0! Never!");
        }
        display.displayVal(result);
        return result;
    }
}
