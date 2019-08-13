package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
    static int TestCounter;
    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("All tests are starting now");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are ending now");
    }
    @Before
    public void beforeEveryTest(){
        TestCounter ++;
        System.out.println("Starting test number: #" + TestCounter);
    }
    //Test 1 - sprawdzenie, czy dodanie nowej figury pokaże ilość 1
    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle(5);
        ShapeCollector collector1 = new ShapeCollector(circle);
        //When
        collector1.addFigure(circle);
        //Then
        Assert.assertEquals(1, collector1.getShapeQuantity());
    }
    //Test 2 - czy pobrana figura jest taka sama jak wstawiona?
    @Test
    public void testGetShape(){
        //Given
        Shape circle = new Circle(5);
        ShapeCollector collector1 = new ShapeCollector(circle);
        collector1.addFigure(circle);
        //When
        Shape circle2 = collector1.getFigure(0);
        //Then
        Assert.assertEquals(circle, circle2);
    }
    //Test 3 - czy próba usunięcia nieistniejącej figury zakończy się niepowodzeniem?
    @Test
    public void testRemoveNonExistingShape(){
        //Given
        Shape circle = new Circle(5);
        ShapeCollector collector1 = new ShapeCollector(circle);
        //When
        boolean result = collector1.removeFigure(circle);
        //Then
        Assert.assertFalse(result);
    }
}
