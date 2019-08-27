package com.kodilla.exception.test;

public class Main {
    public static void main (String args[]){
        Flight flight = new Flight("Budapest", "Barcelona");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println(e.toString());
            System.out.println("Exception was handled!");
        }
        finally{
            System.out.println("Processing...");
        }
        Flight flight2 = new Flight("New Dehli", "Warsaw");
        FlightFinder flightFinder2 = new FlightFinder();
        try {
            flightFinder2.findFlight(flight2);
        }catch (RouteNotFoundException e){
            System.out.println(e.toString());
            System.out.println("Exception was handled!");
        }
        finally{
            System.out.println("Processing...");
        }
    }
}
