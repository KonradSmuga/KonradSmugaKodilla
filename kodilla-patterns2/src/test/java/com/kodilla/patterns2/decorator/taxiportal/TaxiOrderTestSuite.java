package com.kodilla.patterns2.decorator.taxiportal;

import decorator.taxiportal.BasicTaxiOrder;
import decorator.taxiportal.TaxiOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class TaxiOrderTestSuite {

    @Test
    public void textBasicTextOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course", description);
    }
}