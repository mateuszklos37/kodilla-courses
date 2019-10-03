package com.kodilla.good.patterns.challenges.excercise134;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer{

    Map<Product, Integer> products = new HashMap<>();

    public void process(OrderRequest request){
        if(products.containsKey(request.getProduct())){
            if (request.getAmount()> products.get(request.getProduct())){
                System.out.println("The amount of order is too big!");
            }
            else {
                System.out.println("Message to storage was sent");
                System.out.println("You ordered a: " + request.getProduct().getName() + " from Healthy Shop");
            }
        }
        else{
            System.out.println("Producer doesn't deliver this product");
        }
    }

    public String getName(){
        return "Healthy Shop";
    }

    public Map setMap(Product product, Integer amount){
        products.put(product, amount);
        return products;
    }
}
