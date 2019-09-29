package com.kodilla.good.patterns.challenges.excercise132;

import java.time.LocalDate;

public interface OrderService {
    boolean order (User user, Product product, LocalDate date);
}
