package com.kodilla.good.patterns.challenges.excercise134;

import com.kodilla.good.patterns.challenges.excercise132.InformationService;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producer{

    Map<Product, Integer> products = new HashMap<>();

    public void process(OrderRequest request){
        if(products.containsKey(request.getProduct())){
            System.out.println(request.getUser().getName() + "ordered a: " + request.getProduct() + "from Gluten Free Shop");
            System.out.println("Crew of Gluten Free Shop thanks you for your order!");
        }
        else{
            System.out.println("Producer doesn't deliver this product");
        }
    }

    public String getName(){
        return "Gluten Free Shop";
    }

    public Map setMap(Product product, Integer amount){
        products.put(product, amount);
        return products;
    }
}
