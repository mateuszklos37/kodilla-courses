package com.kodilla.testing.weather.stub;
import org.junit.*;
import com.kodilla.testing.weather.stub.WeatherForecast;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        //Given
        Temperature temperature = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperature);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
