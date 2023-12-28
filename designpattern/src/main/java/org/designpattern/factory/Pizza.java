package org.designpattern.factory;

public abstract class Pizza {
    private String name;

    public Pizza(String name){
        this.name = name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }
}
