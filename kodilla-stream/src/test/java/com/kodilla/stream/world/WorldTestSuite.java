
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
        europeCountries.add(new Country("Poland", new BigDecimal("38476269")));
        europeCountries.add(new Country("Ireland", new BigDecimal("5011102")));
        europeCountries.add(new Country("Norway", new BigDecimal("5320045")));
        europeCountries.add(new Country("Denmark", new BigDecimal("5605948")));
        europeCountries.add(new Country("France", new BigDecimal("67106161")));
        europeCountries.add(new Country("Russia", new BigDecimal("142257519")));
        europeCountries.add(new Country("German", new BigDecimal("80594017")));
        europeCountries.add(new Country("Belgium", new BigDecimal("11491346")));
        europeCountries.add(new Country("Netherlands", new BigDecimal("17084719")));


        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(new Country("Malaysia", new BigDecimal("31381992")));
        asianCountries.add(new Country("Japan", new BigDecimal("126451398")));
        asianCountries.add(new Country("South Korea", new BigDecimal("51181299")));
        asianCountries.add(new Country("Indonesia", new BigDecimal("260580739")));
        asianCountries.add(new Country("Thailand", new BigDecimal("68414135")));
        asianCountries.add(new Country("Singapore", new BigDecimal("5888926")));
        asianCountries.add(new Country("Filipines", new BigDecimal("104256076")));
        asianCountries.add(new Country("China", new BigDecimal("1379302771")));
        asianCountries.add(new Country("Vietnam", new BigDecimal("96160163")));

        List<Country> africanCountries = new ArrayList<>();
        africanCountries.add(new Country("Kenya", new BigDecimal("47615739")));
        africanCountries.add(new Country("South Africa", new BigDecimal("54841552")));
        africanCountries.add(new Country("Zimbabwe", new BigDecimal("13805084")));
        africanCountries.add(new Country("Algeria", new BigDecimal("40969443")));
        africanCountries.add(new Country("Nigeria", new BigDecimal("190632261")));
        africanCountries.add(new Country("Etiopia", new BigDecimal("105350020")));
        africanCountries.add(new Country("Madagaskar", new BigDecimal("25054161")));
        africanCountries.add(new Country("Uganda", new BigDecimal("39570125")));
        africanCountries.add(new Country("Ghana", new BigDecimal("27499924")));


        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Europa", europeCountries));
        continents.add(new Continent("Asia", asianCountries));
        continents.add(new Continent("Africa", africanCountries));

        World world = new World(continents);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("3041902934"), totalPeople);

    }
}