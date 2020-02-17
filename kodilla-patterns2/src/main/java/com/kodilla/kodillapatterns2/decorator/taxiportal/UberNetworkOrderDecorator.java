package com.kodilla.kodillapatterns2.decorator.taxiportal;


import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator{
    private TaxiOrder taxiOrder;

    public UberNetworkOrderDecorator(TaxiOrder taxiOrder){
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }
}
