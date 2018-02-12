package com.kodilla.exception.test;
// zmodyfikowac zadanie w taki sposob aby zawieralo mape lotow. Utworzyc hashmape, ktora key - numer lotu, value - lot. Singleton, przechowywanie tabeli
public class Main {
    public static void main(String[] args) throws RouteNotFoundException {

        FindFlight findFlight = new FindFlight();
        findFlight.findFlight(new Flight("Polska", "Niemcy"));
        findFlight.findFlight(new Flight("Kanada", "Norwegia"));
        findFlight.findFlight(new Flight("Kanada", "Dania"));
        findFlight.findFlight(new Flight("Polska", "Jugoslawia"));
    }
}


