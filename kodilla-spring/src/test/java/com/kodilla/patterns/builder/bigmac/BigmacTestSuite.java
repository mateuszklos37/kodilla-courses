package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BigmacTestSuite {
    Bigmac bigmac;
    @Before
    public void before(){
        this.bigmac = new Bigmac.BurgerBuilder().
                bun("Regular").
                sauce("Barbecue").
                burgers(1).
                ingredients("Salad").
                ingredients("Onion").
                ingredients("Chilli").
                ingredients("Cheese").
                build();
    }


    @Test
    public void testBigmacBun(){
        //Given
        //When
        System.out.println(bigmac);
        String typeOfBun = bigmac.getBun();
        //Then
        Assert.assertEquals("Regular", typeOfBun);
    }
    @Test
    public void testAmountOfBurgers(){
        //Given
        //When
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(1, howManyBurgers);
    }
    @Test
    public void testTypeOfSauce(){
        //Given
        //When
        String whichSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals("Barbecue", whichSauce);
    }
    @Test
    public void testAmountOfIngredients(){
        //Given
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
