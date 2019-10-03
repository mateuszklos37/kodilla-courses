package com.kodilla.good.patterns.challenges.excercise135;

import java.util.ArrayList;

public class FlightStorage {
    ArrayList<Flight> flightsList = new ArrayList<>();

    public ArrayList<Flight> addToList(Flight flight){
        flightsList.add(flight);
        flight.getFrom().addAirportTo(flight.getTo());
        flight.getTo().addAirportFrom(flight.getFrom());
        return flightsList;
    }

    public ArrayList<Flight> getFlightsList() {
        return flightsList;
    }
}
