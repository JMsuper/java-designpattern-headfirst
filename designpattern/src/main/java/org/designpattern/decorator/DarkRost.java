package org.designpattern.decorator;

public class DarkRost extends Beverage{

    public DarkRost() {
        super("DarkRost");
    }

    @Override
    public double cost() {
        return 100.0;
    }
}
