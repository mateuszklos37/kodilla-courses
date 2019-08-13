package com.kodilla.testing.shape;

public class Circle implements Shape{
    private int radius;
    static final double pi = 3.14;
    public Circle(int radius){
        this.radius = radius;
    }

    public String getShapeName(){
        return "Circle";
    }

    public double getField(){
        double field = (pi*radius*radius);
        return field;
    }
}
