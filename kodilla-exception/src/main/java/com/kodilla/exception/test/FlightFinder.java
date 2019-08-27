package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Warsaw", true);
        airportsMap.put("New York", true);
        airportsMap.put("Tel Awiw", true);
        airportsMap.put("Berlin", true);
        airportsMap.put("Los Angeles", false);
        airportsMap.put("Madrid", false);
        if (airportsMap.containsKey(flight.getArrivalAirport()) == true)
        {
            System.out.println("From this airport travel to " + flight.getArrivalAirport() + " is: true = possible, false = impossible");
        }
        else{
            throw new RouteNotFoundException("Arrival airport doesn't exist");
        }


    }
}
