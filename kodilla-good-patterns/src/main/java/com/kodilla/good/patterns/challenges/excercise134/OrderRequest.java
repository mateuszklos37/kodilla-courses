package com.kodilla.good.patterns.challenges.excercise134;

public class OrderRequest {
    private User user;
    private Product product;
    private int amount;

    public OrderRequest(User user, Product product, int amount) {
        this.user = user;
        this.product = product;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
