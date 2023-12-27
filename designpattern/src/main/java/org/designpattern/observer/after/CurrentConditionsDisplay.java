package org.designpattern.observer.after;

public class CurrentConditionsDisplay implements Observable{
    private Publisher publisher;
    public CurrentConditionsDisplay(Publisher publisher){
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update(int temp, int humidity, int pressure){
        System.out.println("CurrentConditionsDisplay update");
        System.out.println("temp : " + temp);
        System.out.println("temp : " + humidity);
        System.out.println("temp : " + pressure);
    }


}
