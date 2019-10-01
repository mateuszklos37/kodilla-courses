package com.kodilla.good.patterns.challenges.excercise134;

public class OrderDto {
    private OrderRequest request;
    private boolean ordered;

    public OrderDto(OrderRequest request, boolean ordered) {
        this.request = request;
        this.ordered = ordered;
    }

    public OrderRequest getRequest() {
        return request;
    }

    public boolean isOrdered() {
        return ordered;
    }
}
