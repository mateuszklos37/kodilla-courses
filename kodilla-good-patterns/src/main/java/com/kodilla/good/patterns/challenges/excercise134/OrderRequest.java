package com.kodilla.good.patterns.challenges.excercise134;

public class OrderRequest {
    private User user;
    private Product product;
    private int amount;
    private Producer producer;

    public OrderRequest(User user, Product product, int amount, Producer producer) {
        this.user = user;
        this.product = product;
        this.amount = amount;
        this.producer = producer;
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

    public Producer getProducer() {
        return producer;
    }
}
