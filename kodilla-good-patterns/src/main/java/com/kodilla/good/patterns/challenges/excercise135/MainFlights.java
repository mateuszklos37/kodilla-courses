package com.kodilla.good.patterns.challenges.excercise135;

import java.util.ArrayList;

public class MainFlights {
    public static void main(String args[]){
        Airport krakow = new Airport("Kraków");
        Airport warszawa = new Airport("Warszawa");
        Airport poznan = new Airport("Poznań");
        Airport wroclaw = new Airport("Wrocław");
        Airport gdansk = new Airport("Gdańsk");
        Flight flight1 = new Flight(krakow, wroclaw);
        Flight flight2 = new Flight(warszawa, gdansk);
        Flight flight3 = new Flight(warszawa, krakow);
        Flight flight4 = new Flight(wroclaw, gdansk);
        Flight flight5 = new Flight(wroclaw, krakow);
        Flight flight6 = new Flight(wroclaw, warszawa);
        Flight flight7 = new Flight(gdansk, krakow);
        Flight flight8 = new Flight(krakow, gdansk);
        Flight flight9 = new Flight(krakow, warszawa);
        Flight flight10 = new Flight(poznan, krakow);
        FlightStorage flightStorage = new FlightStorage();
        flightStorage.addToList(flight1);
        flightStorage.addToList(flight2);
        flightStorage.addToList(flight3);
        flightStorage.addToList(flight4);
        flightStorage.addToList(flight5);
        flightStorage.addToList(flight6);
        flightStorage.addToList(flight7);
        flightStorage.addToList(flight8);
        flightStorage.addToList(flight9);
        flightStorage.addToList(flight10);
        FlightFinder flightFinder = new FlightFinder(flightStorage);
        flightFinder.findFlightsTo(warszawa);
        flightFinder.findFlightsFrom(wroclaw);
        flightFinder.findFlights(wroclaw, krakow);
        flightFinder.findFlights(gdansk, wroclaw);
        flightFinder.findFlights(poznan, warszawa);
        flightFinder.findFlights(warszawa, poznan);
    }
}
