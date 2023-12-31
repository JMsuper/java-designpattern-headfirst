package org.designpattern.composite.simple;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Component> {
    private int depth;
    private String name;
    private Stack<Iterator<Component>> stack = new Stack<>();

    public CompositeIterator(int depth, String name, Iterator<Component> iterator){
        this.depth = depth;
        this.name = name;
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        System.out.println("  ".repeat(depth) + name + "'s hasNext() call!");
        if (stack.empty()){
            return false;
        }
        Iterator<Component> iterator = stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }else {
            return true;
        }
    }

    @Override
    public Component next() {
        System.out.println("  ".repeat(depth) + name + "'s next() call!");

        Iterator<Component> iterator = stack.peek();
        Component component = iterator.next();
        if(component instanceof Composite){
            stack.push(component.createIterator(this.depth + 1));
        }
        return component;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
