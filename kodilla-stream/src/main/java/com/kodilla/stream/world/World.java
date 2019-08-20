package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public final class World {
    private BigInteger peopleQuantity=BigInteger.ZERO;
    Set<Continent> continents = new HashSet<Continent>();
    public void addContinent(Continent continent){
        continents.add(continent);
    }
    public BigInteger getQuantityOfPeopleInCountries(){
        return peopleQuantity =  continents.stream().flatMap(continent -> continent.getCountries().stream()
        .map(Country::getQuantityOfPeople)).reduce(BigInteger.ZERO, (sum, current) -> sum.add(current));
    }

    public Set<Continent> getContinents() {
        return continents;
    }
}
