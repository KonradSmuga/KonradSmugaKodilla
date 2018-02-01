
package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
//3 kontynent
    @Test

    public void testGetPeopleQuantity() {
        //Given

        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Polska", new BigDecimal("2311234521234")));
        europeCountries.add(new Country("England", new BigDecimal("12345346457568")));
        europeCountries.add(new Country("Norway", new BigDecimal("235235346346")));
        europeCountries.add(new Country("Polska", new BigDecimal("2311234521234")));
        europeCountries.add(new Country("England", new BigDecimal("12345346457568")));
        europeCountries.add(new Country("Norway", new BigDecimal("235235346346")));
        europeCountries.add(new Country("Polska", new BigDecimal("2311234521234")));
        europeCountries.add(new Country("England", new BigDecimal("12345346457568")));
        europeCountries.add(new Country("Norway", new BigDecimal("235235346346")));


        List<Country> asianCountries = new ArrayList<>();
        europeCountries.add(new Country("Polska", new BigDecimal("2311234521234")));
        europeCountries.add(new Country("England", new BigDecimal("12345346457568")));
        europeCountries.add(new Country("Norway", new BigDecimal("235235346346")));
        europeCountries.add(new Country("Polska", new BigDecimal("2311234521234")));
        europeCountries.add(new Country("England", new BigDecimal("12345346457568")));
        europeCountries.add(new Country("Norway", new BigDecimal("235235346346")));
        europeCountries.add(new Country("Polska", new BigDecimal("2311234521234")));
        europeCountries.add(new Country("England", new BigDecimal("12345346457568")));
        europeCountries.add(new Country("Norway", new BigDecimal("235235346346")));


        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Europa", europeCountries));
        continents.add(new Continent("Asia", asianCountries));


        World world = new World(continents);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("29783632650296"), totalPeople);

    }
}