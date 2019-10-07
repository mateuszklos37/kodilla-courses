package com.kodilla.spring.calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    private static int counter= 0;
    @Before
    public void before(){
        counter ++;
        System.out.println("Every single test starts like this. The number of test is: " + counter);
    }
    @Test
    public void testAddMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultOfAdding = calculator.add(4.7, 2.3);
        //Then
        Assert.assertEquals(7.0, resultOfAdding, 0.01);
    }
    @Test
    public void testSubtractMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double resultOfSubtracting = calculator.sub(4.7, 2.3);
        //Then
        Assert.assertEquals(2.4, resultOfSubtracting, 0.01);
    }
    @Test
    public void testMultiplyMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double resultOfMultiplying = calculator.mul(4.7, 2.3);
        //Then
        Assert.assertEquals(10.81, resultOfMultiplying, 0.01);
    }
    @Test
    public void testDivideMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        try {
            double resultOfDivision = calculator.div(4.7, 2.3);
            //Then
            Assert.assertEquals(2.04, resultOfDivision, 0.02);
        }
        catch (ArithmeticException e){
            System.out.println("Do not ever divide by 0!");
        }
    }
}
