package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public final class Continent {
    private BigInteger peopleOnContinent = BigInteger.ZERO;
    Set <Country> countries = new HashSet<Country>();
    public void addCountry(Country country){
        countries.add(country);
    }
    public Set<Country> getCountries(){
        return countries;
    }

    public BigInteger quantityPeopleOnContinent(){
        for(Country country: countries){
            peopleOnContinent = peopleOnContinent.add(country.getQuantityOfPeople());
        }
        return peopleOnContinent;
    }

}
