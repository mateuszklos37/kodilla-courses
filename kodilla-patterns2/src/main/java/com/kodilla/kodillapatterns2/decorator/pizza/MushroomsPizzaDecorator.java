package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsPizzaDecorator extends AbstractPizzaOrder{
    private PizzaOrder pizzaOrder;

    public MushroomsPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(1.50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mushrooms";
    }
}
