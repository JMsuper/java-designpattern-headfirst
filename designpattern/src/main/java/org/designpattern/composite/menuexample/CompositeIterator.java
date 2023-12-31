package org.designpattern.composite.menuexample;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator){
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }else {
            return true;
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            if(menuComponent instanceof Menu){
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }else {
            return null;
        }
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
