package org.designpattern.decorator;

public class Espresso extends Beverage{

    public Espresso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 200.0;
    }
}
