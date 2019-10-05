package com.kodilla.good.patterns.challenges.excercise135;

public class IndirectFlight {
    Airport airportFrom;
    Airport airportTo;
    Airport airportThrough;
    boolean hasConnection;

    public IndirectFlight(Airport airportFrom, Airport airportTo, Airport airportThrough, boolean hasConnection) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.airportThrough = airportThrough;
        this.hasConnection = hasConnection;
    }

    public Airport getAirportFrom() {
        return airportFrom;
    }

    public Airport getAirportTo() {
        return airportTo;
    }

    public Airport getAirportThrough() {
        return airportThrough;
    }

    public boolean getHasConnection() {
        return hasConnection;
    }

    @Override
    public String toString() {
        return "Indirect Flight: " + "\n" +
                 airportFrom.getCity() +
                " ->  " + airportThrough.getCity() + "\n" +
                airportThrough.getCity() +
                " -> " + airportTo.getCity();
    }
}
