package org.designpattern.composite.simple;

import java.util.Iterator;

public class Leaf extends Component{
    private String name;
    private boolean status;

    public Leaf(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(){
        System.out.print("   " + getName());
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public Iterator<Component> createIterator(int depth) {
        throw new NullPointerException();
    }
}
