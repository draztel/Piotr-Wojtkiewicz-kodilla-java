package com.kodilla.stream.arrayoperations;

import com.kodilla.stream.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] testNumbers = new int[20];
        for(int i=0; i<20; i++) {
            testNumbers[i] = 3 + i;
        }

        double average = ArrayOperations.getAverage(testNumbers);

        Assert.assertEquals(12.5, average, 0.001);
    }
}
