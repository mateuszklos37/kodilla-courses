package com.kodilla.testing.weather.stub;
import java.util.HashMap;

public class TemperaturesStub implements Temperature{
    public HashMap<Integer, Double> getTemperatures(){
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();
        stubResult.put(1, 32.0);
        stubResult.put(2, 25.2);
        stubResult.put(3, 23.7);
        stubResult.put(4, 18.4);
        stubResult.put(5, 24.4);
        return stubResult;
    }
}
