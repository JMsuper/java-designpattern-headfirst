package org.designpattern.strategy.before;

public class RedheadDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
