package com.kodilla.kodillapatterns2.decorator.pizzaportal;

import com.kodilla.kodillapatterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaPortalTestSuite {
    @Test
    public void testBasicPizzaCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        BigDecimal cost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15.0), cost);
    }
    @Test
    public void testPizzaWithHamAndRucolaCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        pizzaOrder = new RucolaPizzaDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(19.0), cost);
    }
    @Test
    public void testPizzaWithMushroomsAndRucolaDescription(){
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new MushroomsPizzaDecorator(pizzaOrder);
        pizzaOrder = new RucolaPizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("You chose: cheese, tomato sauce, mushrooms, rucola", description);
    }
    @Test
    public void testPizzaWithEverything(){
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        pizzaOrder = new MushroomsPizzaDecorator(pizzaOrder);
        pizzaOrder = new RucolaPizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("You chose: cheese, tomato sauce, ham, mushrooms, rucola", description);
    }

}
