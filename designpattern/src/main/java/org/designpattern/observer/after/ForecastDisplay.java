package org.designpattern.observer.after;

public class ForecastDisplay implements Observable{
    private Publisher publisher;

    public ForecastDisplay(Publisher publisher){
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update(int temp, int humidity, int pressure){
        System.out.println("ForecastDisplay update");
        System.out.println("temp : " + temp);
        System.out.println("temp : " + humidity);
        System.out.println("temp : " + pressure);
    }
}
