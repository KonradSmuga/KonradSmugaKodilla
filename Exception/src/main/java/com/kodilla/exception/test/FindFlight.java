package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    private Map<String, Boolean> airportsAllowedToLand = new HashMap<>();

    public FindFlight() {
        airportsAllowedToLand.put("Polska", true);
        airportsAllowedToLand.put("Niemcy", true);
        airportsAllowedToLand.put("Norwegia", true);
        airportsAllowedToLand.put("Dania", true);
        airportsAllowedToLand.put("Kanada", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (!airportsAllowedToLand.getOrDefault(flight.getArrivalAirpor(), Boolean.FALSE)) {
            throw new RouteNotFoundException("z Lotniska " + flight.getDepartureAirport() + "Nie mozna poleciec na lotnisko " +
                    flight.getArrivalAirpor());
        }
        System.out.println("Znaleziono lot miedzy " + flight.getDepartureAirport() + " a " + flight.getArrivalAirpor());
    }
}
