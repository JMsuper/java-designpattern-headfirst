package org.designpattern.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Beverage darkRost = new DarkRost();
        darkRost = new Milk(darkRost);
        darkRost = new Whip(darkRost);

        System.out.println(darkRost.getDescription());
        System.out.println(darkRost.cost());
    }
}
