package org.designpattern.composite.menuexample;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuComponent> allMenusIterator = allMenus.createIterator();
        while (allMenusIterator.hasNext()){
            MenuComponent menuComponent = allMenusIterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){}
        }
    }
}
