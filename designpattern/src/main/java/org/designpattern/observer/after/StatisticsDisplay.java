package org.designpattern.observer.after;

public class StatisticsDisplay implements Observable{
    private Publisher publisher;

    public StatisticsDisplay(Publisher publisher){
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update(int temp, int humidity, int pressure){
        System.out.println("StatisticsDisplay update");
        System.out.println("temp : " + temp);
        System.out.println("temp : " + humidity);
        System.out.println("temp : " + pressure);
    }
}
