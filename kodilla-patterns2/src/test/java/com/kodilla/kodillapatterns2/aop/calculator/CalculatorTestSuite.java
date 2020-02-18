package com.kodilla.kodillapatterns2.aop.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAddMethod(){
        //Given
        //When
        double result = calculator.add(15, 10);
        LOGGER.info("Testing add method");
        //Then
        assertEquals(result, 25, 0);
    }

    @Test
    public void testSubMethod(){
        //Given
        //When
        double result = calculator.sub(15, 10);
        LOGGER.info("Testing subtract method");
        //Then
        assertEquals(5, result, 0);
    }

    @Test
    public void testMulMethod(){
        //Given
        //When
        double result = calculator.multiply(10, 15);
        LOGGER.info("Testing multiply method");
        //Then
        assertEquals(150, result, 0);
    }

    @Test
    public void testDivMethod(){
        //Given
        //When
        double result = calculator.div(15, 5);
        LOGGER.info("Testing divide method");
        //Then
        assertEquals(3, result, 0);
    }

    @Test
    public void testFactorial(){
        //Given
        //When
        BigDecimal result = calculator.factorial(new BigDecimal(6));
        LOGGER.info("Testing factorial method");
        //Then
        assertTrue(BigDecimal.ONE.compareTo(result)<0);
    }
}
