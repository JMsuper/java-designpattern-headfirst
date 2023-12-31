package org.designpattern.compound;

public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable observable) {
        System.out.println("Quakologist: " + observable + " just quacked.");
    }
}
