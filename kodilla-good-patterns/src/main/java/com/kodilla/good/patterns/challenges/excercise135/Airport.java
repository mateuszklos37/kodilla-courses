package com.kodilla.good.patterns.challenges.excercise135;

import java.util.ArrayList;

public class Airport {
    private String city;

    public Airport(String city) {
        this.city = city;
    }

    public Airport(){

    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "city='" + city + '\'' +
                '}';
    }
}
