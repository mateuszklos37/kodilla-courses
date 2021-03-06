package com.kodilla.stream.array;
import org.junit.Assert;
import com.kodilla.stream.array.ArrayOperations;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] tab = new int[20];
        for (int i = 0; i<tab.length; i++){
            tab[i] = i;
        }
        //When
        double calculatedAverage = ArrayOperations.getAverage(tab);
        //Then
        Assert.assertEquals(5.0, calculatedAverage, 0.001);
    }
}
