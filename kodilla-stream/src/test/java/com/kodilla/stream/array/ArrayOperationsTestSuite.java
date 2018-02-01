package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given

        int[] notes = {1, 3, 5, 11, 24, 13, 61, 23, 11, 2, 5, 6, 9, 1, 121, 32, 55, 72, 25,
                11};
        //When
        Double average = ArrayOperations.getAverage(notes);

        //then
        Assert.assertEquals(new Double(0), average);
    }
}
