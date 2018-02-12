package com.kodilla.exception.test;
public class Main {
    public static void main(String[] args) throws RouteNotFoundException {

        FindFlight findFlight = new FindFlight();
        findFlight.findFlight(new Flight("Polska", "Niemcy"));
        findFlight.findFlight(new Flight("Kanada", "Norwegia"));
        findFlight.findFlight(new Flight("Kanada", "Dania"));
        findFlight.findFlight(new Flight("Polska", "Jugoslawia"));
    }
}


