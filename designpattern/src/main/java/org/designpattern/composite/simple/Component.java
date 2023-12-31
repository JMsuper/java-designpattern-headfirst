package org.designpattern.composite.simple;

import java.util.Iterator;

public abstract class Component {
    public void add(Component menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(Component menuComponent){
        throw new UnsupportedOperationException();
    }
    public Component getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }
    public boolean isStatus(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<Component> createIterator(int depth);
}
