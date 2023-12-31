package org.designpattern.compound;

public class RedheadDuck implements Quackable{
    Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("quack!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
