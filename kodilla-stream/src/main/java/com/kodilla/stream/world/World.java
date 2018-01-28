package com.kodilla.stream.world;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.math.*;

public class World implements PeopleQuantity {
    Continent continent;
    List<Continent> countriesOnTheWorld = new ArrayList<>();

    public List<Continent> getNameOfTheContinent() {
        countriesOnTheWorld.add(continent);
        return countriesOnTheWorld;

    }

    @Override
    public BigDecimal getPeopleQuantity() {
            return  BigDecimal.ONE;
    }
}