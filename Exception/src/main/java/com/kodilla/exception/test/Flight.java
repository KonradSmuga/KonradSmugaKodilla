package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
    private String arrivalAirpor;

    public Flight(String departureAirport, String arrivalAirpor) {
        this.departureAirport = departureAirport;
        this.arrivalAirpor = arrivalAirpor;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirpor() {
        return arrivalAirpor;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirpor='" + arrivalAirpor + '\'' +
                '}';
    }
}
