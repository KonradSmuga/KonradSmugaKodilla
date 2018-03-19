package com.kodilla.spring.web;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AverageTest {

    @Test
    public void calculateAverage() {

        //Given
        Average average = new Average();
        List<Double> notes = Arrays.asList(2.5, 3.0, 4.0, 3.5);
        //When
        Double avg = average.calculateAverage(notes);
        //Then
        Assert.assertEquals(new Double(3.25), avg);
    }
}