package com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class World implements PeopleQuantity {

    private  List<Continent> countriesOnTheWorld = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        return countriesOnTheWorld.stream()
                .flatMap(c->c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }


}