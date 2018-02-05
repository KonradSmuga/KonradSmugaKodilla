package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFlight {
    private Flight flight;

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportName = new HashMap<>();
        Set<String> keys = airportName.keySet();

        for(String key : keys ){
            String name = airportName.get(key).toString();

            if(name.equals(false));
            throw new RouteNotFoundException("There is no airport with provided name");
        }

    }
}
