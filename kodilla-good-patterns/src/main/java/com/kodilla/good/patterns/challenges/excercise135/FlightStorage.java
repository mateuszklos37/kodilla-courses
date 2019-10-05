package com.kodilla.good.patterns.challenges.excercise135;

import java.util.ArrayList;

public class FlightStorage {
    ArrayList<Flight> flightsList = new ArrayList<>();

    public ArrayList<Flight> addToList(Flight flight){
        flightsList.add(flight);
        return flightsList;
    }

    public ArrayList<Flight> getFlightsList() {
        return flightsList;
    }
}
