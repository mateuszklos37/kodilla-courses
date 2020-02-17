package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrder implements PizzaOrder{
    private PizzaOrder pizzaOrder;

    public AbstractPizzaOrder (PizzaOrder pizzaOrder){
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public String getDescription(){
        return pizzaOrder.getDescription();
    }
}
