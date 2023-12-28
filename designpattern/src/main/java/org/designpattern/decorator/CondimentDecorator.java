package org.designpattern.decorator;

public abstract class CondimentDecorator extends Beverage{
    private Beverage beverage;

    public CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    public abstract String getDescription();
}
