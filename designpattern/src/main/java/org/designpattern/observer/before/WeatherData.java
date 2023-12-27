package org.designpattern.observer.before;

import org.designpattern.observer.WeatherStation;

public class WeatherData {

    WeatherStation weatherStation;

    public WeatherData(){
        weatherStation = new WeatherStation(10,20,30);
    }

    public void measurementsChanged(){
        int temp = getTemperature();
        int humidity = getHumidity();
        int pressure = getPressure();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        currentConditionsDisplay.update(temp,humidity,pressure);
        statisticsDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);
    }


    private int getTemperature(){
        return weatherStation.getTemperature();
    }

    private int getHumidity(){
        return weatherStation.getHumidity();
    }

    private int getPressure(){
        return weatherStation.getPressure();
    }
}
