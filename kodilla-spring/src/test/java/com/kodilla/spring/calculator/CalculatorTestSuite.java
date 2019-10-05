package com.kodilla.spring.calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculator(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultOfAdding = calculator.add(4.7, 2.3);
        double resultOfSubtracting = calculator.sub(4.7, 2.3);
        double resultOfMultiplying = calculator.mul(4.7, 2.3);
        double resultOfDivision = calculator.div(4.7, 2.3);
        //Then
        Assert.assertEquals(7.0, resultOfAdding, 0.01);
        Assert.assertEquals(2.4, resultOfSubtracting, 0.01);
        Assert.assertEquals(10.81, resultOfMultiplying, 0.01);
        Assert.assertEquals(2.04, resultOfDivision, 0.02);
    }
}
