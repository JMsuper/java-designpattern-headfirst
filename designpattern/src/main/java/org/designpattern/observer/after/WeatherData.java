package org.designpattern.observer.after;

import org.designpattern.observer.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData extends Publisher {

    WeatherStation weatherStation;
    List<Observable> observableList;

    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData(){
        weatherStation = new WeatherStation(10,20,30);
        observableList = new ArrayList<>();
    }

    public void measurementsChanged() {
        this.temperature = getWeatherStationTemperature();
        this.humidity = getWeatherStationHumidity();
        this.pressure = getWeatherStationPressure();

        System.out.println("notify observers");
        notifyObservers();
    }


    public int getWeatherStationTemperature() {
        return weatherStation.getTemperature();
    }
    public int getWeatherStationHumidity() {return weatherStation.getHumidity();}
    public int getWeatherStationPressure() {
        return weatherStation.getPressure();
    }

    @Override
    public void addObserver(Observable observable) {
        observableList.add(observable);
    }

    @Override
    public void removeObserver(Observable observable) {
        observableList.remove(observable);
    }

    @Override
    public void notifyObservers() {
        observableList.forEach(observable -> observable.update(temperature,humidity,pressure));
    }
}
