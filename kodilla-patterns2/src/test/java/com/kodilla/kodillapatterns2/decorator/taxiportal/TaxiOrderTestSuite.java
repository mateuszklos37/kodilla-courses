package com.kodilla.kodillapatterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicOrderTaxiGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        BigDecimal costOfOrder = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5.00), costOfOrder);
    }
    @Test
    public void testBasicOrderTaxiGetDescription(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        String resultDescription = theOrder.getDescription();
        //Then
        assertEquals("Drive a course", resultDescription);
    }
    @Test
    public void testTaxiNetworkGetCost(){
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(40), calculatedCost);
    }
    @Test
    public void testTaxiNetworkGetDescription(){
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }
    @Test
    public void testMyTaxiNetworkWithChildSeatGetCost(){
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(37.0), calculatedCost);
    }
}
