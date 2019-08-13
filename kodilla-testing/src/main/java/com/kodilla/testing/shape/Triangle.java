package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private int basis;
    private int height;

    public Triangle(int basis, int height){
        this.basis = basis;
        this.height = height;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public double getField(){
        double field = ((basis*height)/2);
        return field;
    }
}
