package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Continent {
    Country country;

    private final List<Country> countries = new ArrayList<>();

    public Country getCountry() {
        return country;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "country=" + country +
                ", nameOfTheContinent="  +
                '}';
    }
}