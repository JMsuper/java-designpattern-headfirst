package org.designpattern.observer;

public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherStation(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
