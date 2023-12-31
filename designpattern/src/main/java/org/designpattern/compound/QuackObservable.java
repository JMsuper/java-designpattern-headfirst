package org.designpattern.compound;


public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
