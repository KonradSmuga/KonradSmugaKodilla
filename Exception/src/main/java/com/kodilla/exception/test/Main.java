package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws RouteNotFoundException {
        Map<String, Boolean> airportName = new HashMap<>();
        airportName.put("Polska", true);
        airportName.put("Niemcy", true);
        airportName.put("Norwegia", true);
        airportName.put("Dania", true);
        airportName.put("Kanada", false);

        FindFlight findFlight = new FindFlight();
        findFlight.findFlight(new Flight("polska", "niemcy"));
        if (airportName.get("Polska")) {
            throw new RouteNotFoundException("Provided route not found");
        }
    }
}

