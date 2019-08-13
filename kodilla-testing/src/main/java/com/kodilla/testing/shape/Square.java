package com.kodilla.testing.shape;

public class Square implements Shape{
    private int squareLength;

    public Square(int squareLength) {
        this.squareLength = squareLength;
    }

    public String getShapeName(){
        return "Square";
    }

    public double getField(){
        double field = (squareLength*squareLength);
        return field;
    }
}
