
package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity() {
        //Given

        List<Country> countries = new ArrayList<>();
        countries.add(new Country());
        countries.add(new Country());
        countries.add(new Country());

        //When
        BigDecimal totalPeople = BigDecimal.ZERO;
        for(Country world : countries ){
            totalPeople = totalPeople.add(world.getPeopleQuantity());
        }

        //Then
        BigDecimal epectedPeople = new BigDecimal("633333332711111111010");
        Assert.assertEquals(epectedPeople, totalPeople);
    }
}