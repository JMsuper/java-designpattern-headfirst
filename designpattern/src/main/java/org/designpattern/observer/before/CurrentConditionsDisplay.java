package org.designpattern.observer.before;

public class CurrentConditionsDisplay {
    public void update(int temp, int humidity, int pressure){
        System.out.println("CurrentConditionsDisplay update");
        System.out.println("temp : " + temp);
        System.out.println("temp : " + humidity);
        System.out.println("temp : " + pressure);
    }


}
