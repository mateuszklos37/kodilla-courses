package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import com.kodilla.stream.world.*;

import java.math.BigInteger;


public class WorldTestSuite {
    @Test
    public void testPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent northAmerica = new Continent();
        europe.addCountry(new Country("Poland", new BigInteger("37000000")));
        europe.addCountry(new Country("Great Britain", new BigInteger("66000000")));
        europe.addCountry(new Country("Portugal", new BigInteger("10800000")));
        asia.addCountry(new Country("China", new BigInteger("1400000000")));
        asia.addCountry(new Country("Vietnam", new BigInteger("93000000")));
        asia.addCountry(new Country("Korea", new BigInteger("74000000")));
        asia.addCountry(new Country("Japan", new BigInteger("125000000")));
        northAmerica.addCountry(new Country("USA", new BigInteger("326080000")));
        northAmerica.addCountry(new Country("Mexico", new BigInteger("124570000")));
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        //When
        BigInteger totalQuantity =  world.getQuantityOfPeopleInCountries();
        BigInteger worldExpected = new BigInteger("2256450000");
        BigInteger europeExpected = new BigInteger("113800000");
        //Then
        //Test - total quantity of poeple in the world
        Assert.assertEquals(worldExpected, totalQuantity);
        //Test - number of continents and countries on continents
        Assert.assertEquals(3, world.getContinents().size());
        Assert.assertEquals(3, europe.getCountries().size());
        Assert.assertEquals(2, northAmerica.getCountries().size());
        Assert.assertEquals(4, asia.getCountries().size());
        //Test - quantity of people on each continent
        Assert.assertEquals(europeExpected, europe.quantityPeopleOnContinent());
        Assert.assertEquals(europeExpected, europe.quantityPeopleOnContinent());

    }


}
