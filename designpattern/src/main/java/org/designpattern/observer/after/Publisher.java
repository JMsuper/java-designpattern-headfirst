package org.designpattern.observer.after;

public abstract class Publisher {
    public abstract void addObserver(Observable observable);

    public abstract void removeObserver(Observable observable);

    public abstract void notifyObservers();
}
