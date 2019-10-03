package com.kodilla.good.patterns.challenges.excercise134;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    private Map<Product, Integer> products = new HashMap<>();

    public void process(OrderRequest request) {
        System.out.println("We would like to ask you to join our Facebook fanpage");
        if (products.containsKey(request.getProduct())) {
            if (request.getAmount() > products.get(request.getProduct())) {
                System.out.println("The amount of order is too big!");
            } else {
                System.out.println("You ordered a: " + request.getProduct().getName() + "from Extra Food Shop");
            }
        }  else {
            System.out.println("Producer doesn't deliver this product");
            }
        }
        public String getName() {
            return "Gluten Free Shop";
        }

        public Map setMap (Product product, Integer amount){
            products.put(product, amount);
            return products;
        }
}
