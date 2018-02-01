package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Continent {
    private String name;

    private List<Country> country;


    public Continent(String name, List<Country> country) {
        this.name = name;
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public List<Country> getCountry() {
        return country;
    }


}