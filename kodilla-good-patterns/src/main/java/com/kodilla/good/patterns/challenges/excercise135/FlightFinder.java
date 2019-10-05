package com.kodilla.good.patterns.challenges.excercise135;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    FlightStorage storage;

    public FlightFinder(FlightStorage storage){
        this.storage = storage;
    }

        public ArrayList<Flight> findFlightsTo (Airport airport){
            System.out.println("Flights to: " + airport.getCity());
            ArrayList<Flight> flightList =  (ArrayList<Flight>) storage.getFlightsList().stream().filter(f -> f.getTo().getCity().equals(airport.getCity())).collect(Collectors.toList());
            for(Flight temp: flightList){
                System.out.println(temp);
            }
            return flightList;
        }

        public List<Flight> findFlightsFrom (Airport airport){
            System.out.println("Flights from: " + airport.getCity());
            ArrayList<Flight> flightListFrom = (ArrayList<Flight>) storage.getFlightsList().stream().filter(f -> f.getFrom().getCity().equals(airport.getCity())).collect(Collectors.toList());
            for(Flight temp: flightListFrom){
                System.out.println(temp);
            }
            return flightListFrom;
        }

        public List<Flight> findDirectFlight(Airport fromAirport, Airport toAirport){
            System.out.println("Direct flight from: " + fromAirport.getCity() + " to: " + toAirport.getCity());
            List<Flight> directFlights;
            directFlights = storage.getFlightsList().stream().filter(a -> a.getFrom().equals(fromAirport)).filter(a -> a.getTo().equals(toAirport)).collect(Collectors.toList());
            for (Flight temp: directFlights)
            {
                System.out.println(temp);
            }
            return directFlights;
        }

        public IndirectFlight findNotDirectFlight (Airport fromAirport, Airport toAirport){
            System.out.println("Not direct flight from: " + fromAirport.getCity() + " to: " + toAirport.getCity());
            Airport indirectAirport = new Airport();
            List<Airport> indirectTo = storage.getFlightsList().stream().filter(f -> f.getFrom().getCity().equals(fromAirport.getCity())).map(f -> f.getTo()).collect(Collectors.toList());
            List<Airport> indirectFrom = storage.getFlightsList().stream().filter(f -> f.getTo().getCity().equals(toAirport.getCity())).map(f -> f.getFrom()).collect(Collectors.toList());
            for (Airport temp: indirectTo){
                if(indirectFrom.contains(temp)){
                    indirectAirport = temp;
                }
            }
            boolean hasConnection;
            if(indirectAirport.getCity()!=null){
                hasConnection = true;
            }
            else{
                hasConnection = false;
            }
            IndirectFlight indirectFlight = new IndirectFlight(fromAirport, toAirport, indirectAirport, hasConnection);
            return indirectFlight;
    }

    public List<IndirectFlight> notDirectFlightRequest(Airport fromAirport, Airport toAirport){
        IndirectFlight indirectFlight = findNotDirectFlight(fromAirport, toAirport);
        List<IndirectFlight> listOfIndirectFlights = new ArrayList<>();
        listOfIndirectFlights.isEmpty();
        if(indirectFlight.hasConnection){
            listOfIndirectFlights.add(indirectFlight);
        }
        else{
            System.out.println("None flights");
        }
        for(IndirectFlight temp: listOfIndirectFlights){
            System.out.println(temp);
        }
        return listOfIndirectFlights;
    }

    public void findFlights (Airport fromAirport, Airport toAirport){
        findDirectFlight(fromAirport, toAirport);
        notDirectFlightRequest(fromAirport, toAirport);
    }
}
