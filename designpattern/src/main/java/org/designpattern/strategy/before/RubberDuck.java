package org.designpattern.strategy.before;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void quack() {

    }
}
