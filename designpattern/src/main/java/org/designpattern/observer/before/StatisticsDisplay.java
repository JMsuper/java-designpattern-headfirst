package org.designpattern.observer.before;

public class StatisticsDisplay {
    public void update(int temp, int humidity, int pressure){
        System.out.println("StatisticsDisplay update");
        System.out.println("temp : " + temp);
        System.out.println("temp : " + humidity);
        System.out.println("temp : " + pressure);
    }
}
