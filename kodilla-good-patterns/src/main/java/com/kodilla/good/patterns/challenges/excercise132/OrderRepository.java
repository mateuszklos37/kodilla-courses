package com.kodilla.good.patterns.challenges.excercise132;

import java.time.LocalDate;

public interface OrderRepository {
    public void createOrder (User user, Product product, LocalDate date);
}
