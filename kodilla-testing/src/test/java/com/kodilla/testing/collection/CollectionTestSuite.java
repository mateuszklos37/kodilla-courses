package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing empty list condition");
        exterminator.exterminate(list);
        //Then
        if(list.size()==0){
            System.out.println("List is empty - Test ok!");
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(15);
        list.add(23);
        list.add(42);
        list.add(53);
        list.add(21);
        list.add(90);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing empty list condition");
        exterminator.exterminate(list);
        //Then
        if(list.size()>0){
            System.out.println("List of odd elements collected - Test ok!");
        }
    }
}
