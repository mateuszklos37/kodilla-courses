package com.kodilla.good.patterns.challenges.excercise134;

import java.util.HashMap;
import java.util.Map;

public class Producer {

    private String name;
    private Map <Product, Integer> products = new HashMap<>();

    public Producer(String name, Map<Product, Integer> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

}
