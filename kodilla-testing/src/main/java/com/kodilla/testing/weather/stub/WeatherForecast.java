package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    Temperature temperature;

    public WeatherForecast(Temperature temperature) {
        this.temperature = temperature;
    }

    public HashMap<Integer, Double> calculateForecast(){
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for (Map.Entry<Integer, Double> temperature : temperature.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue()+1);
        }
        return resultMap;
    }
}
