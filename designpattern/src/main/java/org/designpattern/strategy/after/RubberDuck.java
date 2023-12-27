package org.designpattern.strategy.after;


import org.designpattern.strategy.after.behavior.QuackLouder;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new QuackLouder();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

}
