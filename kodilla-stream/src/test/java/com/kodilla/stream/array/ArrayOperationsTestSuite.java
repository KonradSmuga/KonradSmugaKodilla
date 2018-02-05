package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given

        int[] notes = {1, 3, 5, 11, 24, 13, 61, 23, 11, 2, 5, 6, 9, 2, 1, 1, 1, 2, 8,
                3};
        //When
        Double average = ArrayOperations.getAverage(notes);

        //then
        Assert.assertEquals(new Double(10.052631578947368), average);
    }
}
