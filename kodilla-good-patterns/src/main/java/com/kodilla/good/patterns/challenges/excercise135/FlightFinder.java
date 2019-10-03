package com.kodilla.good.patterns.challenges.excercise135;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
        public static void findFlightsTo (FlightStorage storage, Airport airport){
            System.out.println("Flights to: " + airport.getCity());
            storage.getFlightsList().stream().filter(f -> f.getTo().getCity().equals(airport.getCity())).forEach(System.out::println);
        }

        public static void findFlightsFrom (FlightStorage storage, Airport airport){
            System.out.println("Flights from: " + airport.getCity());
            storage.getFlightsList().stream().filter(f -> f.getFrom().getCity().equals(airport.getCity())).forEach(System.out::println);
        }

        public static void findDirectFlight(FlightStorage storage, Airport fromAirport, Airport toAirport){
            System.out.println("Direct flight from: " + fromAirport.getCity() + " to: " + toAirport.getCity());
            storage.getFlightsList().stream().filter(a -> a.getFrom().equals(fromAirport)).filter(a -> a.getTo().equals(toAirport)).forEach(System.out::println);
        }

        public static void findNotDirectFlight (Airport fromAirport, Airport toAirport){
            System.out.println("Not direct flight from: " + fromAirport.getCity() + " to: " + toAirport.getCity());
            List <String> indirectTo = fromAirport.getFlightsTo().stream().map(a -> a.getCity()).collect(Collectors.toList());
            List<String> indirectFrom = toAirport.getFlightsFrom().stream().map(a -> a.getCity()).collect(Collectors.toList());
            for (String temp: indirectTo){
                if(indirectFrom.contains(temp)){
                    System.out.println("You can fly from: " + fromAirport.getCity() + " to: " + toAirport.getCity() + " through: " + temp);
                }
            }
        }
}
