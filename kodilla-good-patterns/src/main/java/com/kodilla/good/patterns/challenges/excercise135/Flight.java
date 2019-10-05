package com.kodilla.good.patterns.challenges.excercise135;

public class Flight {
    private Airport from;
    private Airport to;

    public Flight(Airport from, Airport to) {
        this.from = from;
        this.to = to;
    }

    public Airport getTo() {
        return to;
    }

    public Airport getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from=" + from.getCity() +
                ", to=" + to.getCity() +
                '}';
    }
}
