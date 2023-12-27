package org.designpattern.strategy.after;

import org.designpattern.strategy.after.behavior.FlyWithWings;
import org.designpattern.strategy.after.behavior.QuackLouder;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super();
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackLouder();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }
}
