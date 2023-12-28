package org.designpattern.decorator;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super("Whip", beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 10.0;
    }

    @Override
    public String getDescription() {
        return description + " " + getBeverage().getDescription();
    }
}
