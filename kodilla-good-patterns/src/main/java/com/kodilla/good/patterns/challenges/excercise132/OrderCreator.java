package com.kodilla.good.patterns.challenges.excercise132;

import java.time.LocalDate;

public class OrderCreator implements OrderService {
    public boolean order (User user, Product product, LocalDate date){
        System.out.println("Order for: " + user.getNick() + "\n" + "Product: " + product.getName() + "\n" + "Created: " + date.getDayOfMonth() + " " +  date.getMonth() + " " + date.getYear());
        return true;
    }
}
