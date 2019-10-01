package com.kodilla.good.patterns.challenges.excercise134;

public interface Producer {
    void process(OrderRequest request);
    String getName();
}
