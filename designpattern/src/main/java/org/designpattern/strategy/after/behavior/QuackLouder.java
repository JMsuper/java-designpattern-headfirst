package org.designpattern.strategy.after.behavior;

public class QuackLouder implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Louder!");
    }
}
