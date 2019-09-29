package com.kodilla.good.patterns.challenges.excercise132;

import java.time.LocalDate;

public class RepositoryCreator implements OrderRepository {
    public void createOrder(User user, Product product, LocalDate date){
        System.out.println("Order took to repository");
    }
}
