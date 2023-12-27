package org.designpattern.strategy.after;

import org.designpattern.strategy.after.behavior.FlyBehavior;
import org.designpattern.strategy.after.behavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("swim");
    }

    public boolean canFly(){
        return flyBehavior != null;
    }

    public boolean canQuack(){
        return quackBehavior != null;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public abstract void display();
}
