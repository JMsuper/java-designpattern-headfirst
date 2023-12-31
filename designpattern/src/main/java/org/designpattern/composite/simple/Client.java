package org.designpattern.composite.simple;

import java.util.Iterator;

public class Client {
    Component component;

    public Client(Component allMenus){
        this.component = allMenus;
    }

    public void print(){
        component.print();
    }

    public void printStatus(){
        Iterator<Component> allMenusIterator = component.createIterator(0);
        while (allMenusIterator.hasNext()){
            Component component = allMenusIterator.next();
            try{
                if(component.isStatus()){
                    component.print();
                }
            }catch (UnsupportedOperationException e){}
        }
    }
}
