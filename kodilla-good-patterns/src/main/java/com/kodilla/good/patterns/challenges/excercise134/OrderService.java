package com.kodilla.good.patterns.challenges.excercise134;

public interface OrderService {
    boolean createOrder(User user, Product product, int amount, Producer producer);
}
