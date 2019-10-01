package com.kodilla.good.patterns.challenges.excercise134;

public class OrderCreator implements OrderService {
    public boolean createOrder(User user, Product product, int amount, Producer producer){
        System.out.println("Order created for: " + user.getName() + "\nOrdered product: " + product.getName() + "\nIn amount: " + amount + "\nFrom: " + producer.getName());
        return true;
    }

}
