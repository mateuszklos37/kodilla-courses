package com.kodilla.good.patterns.challenges.excercise135;

import java.util.ArrayList;

public class Airport {
    private String city;
    ArrayList <Airport> flightsTo = new ArrayList<>();
    ArrayList <Airport> flightsFrom = new ArrayList<>();

    public Airport(String city) {
        this.city = city;
        flightsTo.isEmpty();
        flightsFrom.isEmpty();
    }

    public String getCity() {
        return city;
    }

    public ArrayList<Airport> addAirportTo(Airport airport){
        flightsTo.add(airport);
        return flightsTo;
    }

    public ArrayList<Airport> addAirportFrom(Airport airport){
        flightsFrom.add(airport);
        return flightsFrom;
    }

    public ArrayList<Airport> getFlightsTo() {
        return flightsTo;
    }

    public ArrayList<Airport> getFlightsFrom() {
        return flightsFrom;
    }
}
