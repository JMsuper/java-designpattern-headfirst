package org.designpattern.factory;

public class FactoryRunner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println(cheesePizza.getName());

        Pizza peperoniPizza = pizzaStore.orderPizza("peperoni");
        System.out.println(peperoniPizza.getName());

    }
}
