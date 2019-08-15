package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperature;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.*;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock(){
        //Given
        Temperature temperatureMock = mock(Temperature.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperatureMock);
        HashMap<Integer, Double> temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(1, 32.0);
        temperaturesMap.put(2, 25.2);
        temperaturesMap.put(3, 23.7);
        temperaturesMap.put(4, 18.4);
        temperaturesMap.put(5, 24.4);
        when(temperatureMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
