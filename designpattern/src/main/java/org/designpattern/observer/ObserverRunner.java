package org.designpattern.observer;

import org.designpattern.observer.after.CurrentConditionsDisplay;
import org.designpattern.observer.after.ForecastDisplay;
import org.designpattern.observer.after.StatisticsDisplay;
import org.designpattern.observer.after.WeatherData;

public class ObserverRunner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new StatisticsDisplay(weatherData);

        weatherData.measurementsChanged();
    }
}
