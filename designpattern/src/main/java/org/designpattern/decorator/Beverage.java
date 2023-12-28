package org.designpattern.decorator;

public abstract class Beverage {
    public String description;

    public Beverage(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
