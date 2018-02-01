package com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class World  {

    private  List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(c->c.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}