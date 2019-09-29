package com.kodilla.good.patterns.challenges.excercise132;

public class OrderDto {
    User user;
    Product product;
    boolean isOrdered;

    public OrderDto(User user, Product product, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
