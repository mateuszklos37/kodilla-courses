package com.kodilla.good.patterns.challenges.excercise132;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDate date;

    public OrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;
        this.date = LocalDate.now();
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDate() {
        return date;
    }
}
