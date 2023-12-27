package org.designpattern.strategy;

import org.designpattern.strategy.after.DecoyDuck;
import org.designpattern.strategy.after.Duck;
import org.designpattern.strategy.after.RedheadDuck;
import org.designpattern.strategy.after.RubberDuck;

import java.util.ArrayList;

public class StrategyRunner {
    public static void main(String[] args) {
        after();
    }

    private static void after(){
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new RedheadDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new RubberDuck());

        for (Duck duck : ducks){
            duck.display();
            if (duck.canFly()) duck.getFlyBehavior().fly();
            if (duck.canQuack()) duck.getQuackBehavior().quack();
        }
    }
}
