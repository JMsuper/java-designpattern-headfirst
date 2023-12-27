package org.designpattern.strategy.after;

import org.designpattern.strategy.after.behavior.FlyBehavior;
import org.designpattern.strategy.after.behavior.FlyWithWings;
import org.designpattern.strategy.after.behavior.QuackBehavior;
import org.designpattern.strategy.after.behavior.QuackLouder;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        super();
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackLouder();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }

}
