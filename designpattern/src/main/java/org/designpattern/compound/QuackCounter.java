package org.designpattern.compound;

public class QuackCounter implements Quackable{
    private Quackable quackable;
    static int numberOfQuacks;
    Observable observable = new Observable(this);

    public QuackCounter(Quackable quackable){
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks += 1;
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
