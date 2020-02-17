package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamPizzaDecorator extends AbstractPizzaOrder{
    private PizzaOrder pizzaOrder;

    public HamPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(2.0));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", ham";
    }
}
