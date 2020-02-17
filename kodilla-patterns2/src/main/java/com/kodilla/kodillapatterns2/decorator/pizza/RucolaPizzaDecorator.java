package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class RucolaPizzaDecorator extends AbstractPizzaOrder{
    private PizzaOrder pizzaOrder;

    public RucolaPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(", rucola");
    }
}
