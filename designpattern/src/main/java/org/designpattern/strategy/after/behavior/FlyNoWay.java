package org.designpattern.strategy.after.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("no way!");
    }
}
