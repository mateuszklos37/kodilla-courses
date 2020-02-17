package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder{
    public BigDecimal getPrice(){
        return new BigDecimal(15.0);
    }

    public String getDescription(){
        return "You chose: cheese, tomato sauce";
    }
}
