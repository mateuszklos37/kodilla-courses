package com.kodilla.good.patterns.challenges.excercise134;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode(){
        if (getName().startsWith("A") || getName().startsWith("B") || getName().startsWith("C")) {
            return 1;
        }
        else if (getName().startsWith("D") || getName().startsWith("E") || getName().startsWith("F")) {
            return 2;
        }
        else if (getName().startsWith("G") || getName().startsWith("H") || getName().startsWith("I")){
            return 3;
        }
        else if (getName().startsWith("J") || getName().startsWith("K") || getName().startsWith("L")){
            return 4;
        }
        else if (getName().startsWith("M") || getName().startsWith("N") || getName().startsWith("O")){
            return 5;
        }
        else if (getName().startsWith("P") || getName().startsWith("Q") || getName().startsWith("R") || getName().startsWith("S")){
            return 6;
        }
        else if (getName().startsWith("T") || getName().startsWith("U") || getName().startsWith("V")){
            return 7;
        }
        else {
            return 8;
        }
    }

    public boolean equals(Object o){
        Product p = (Product) o;
        return this.name.equals(p.getName());
    }
}
