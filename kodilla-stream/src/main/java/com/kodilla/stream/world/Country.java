package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Country {
    private final String name;
    private final BigInteger quantityOfPeople;

    public Country(String name, BigInteger quantityOfPeople) {
        this.name = name;
        this.quantityOfPeople = quantityOfPeople;
    }

    public BigInteger getQuantityOfPeople() {
        return quantityOfPeople;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o){
        Country country = (Country) o;
        return this.getName().equals(country.getName());
    }
}
