package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    Shape shape;
    ArrayList<Shape> list = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        //list.add(shape);
        //done
    }


    public Shape getFigure(int shapeNumber){
        //Shape shape = null;
        //if (shapeNumber>=0 && shapeNumber <= list.size()){
        //    shape = list.get(shapeNumber);
        //}
        //return shape;
        //}
        return null;
    }
    public boolean removeFigure (Shape shape){
        boolean result = false;
        //if (list.contains(shape)){
          //  list.remove(shape);
         //   result = true;
        //}
        return result;
    }

    public void showFigures(){
        //for (Shape temp:list) {
        //    System.out.println(temp);
        //}
    }
    public int getShapeQuantity(){
        return list.size();
    }
}
