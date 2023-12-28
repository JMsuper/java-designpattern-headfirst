package org.designpattern.decorator;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super("Milk", beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 20.0;
    }

    @Override
    public String getDescription() {
        return description + " " + getBeverage().getDescription();
    }
}
