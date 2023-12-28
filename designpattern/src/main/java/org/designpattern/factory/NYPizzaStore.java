package org.designpattern.factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "peperoni":
                pizza = new NYPeperoniPizza();
                break;
        }
        return pizza;
    }
}

class NYCheesePizza extends Pizza{

    public NYCheesePizza() {
        super("NYCheesePizza");
    }

    @Override
    public void prepare() {
        System.out.println("prepare 1 minute");
    }

    @Override
    public void bake() {
        System.out.println("prepare 12 minute");
    }

    @Override
    public void cut() {
        System.out.println("prepare 14 minute");
    }

    @Override
    public void box() {
        System.out.println("prepare 11 minute");
    }
}

class NYPeperoniPizza extends Pizza{

    public NYPeperoniPizza() {
        super("NYPeperoniPizza");
    }

    @Override
    public void prepare() {
        System.out.println("prepare 2 minute");
    }

    @Override
    public void bake() {
        System.out.println("prepare 3 minute");
    }

    @Override
    public void cut() {
        System.out.println("prepare 23 minute");
    }

    @Override
    public void box() {
        System.out.println("prepare 1 minute");
    }
}