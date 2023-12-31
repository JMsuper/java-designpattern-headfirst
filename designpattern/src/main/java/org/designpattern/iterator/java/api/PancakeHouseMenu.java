package org.designpattern.iterator.java.api;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        this.menuItems = new ArrayList<>();

        addItem("K&B pencake set","egg & toast pencake",true,2.99);

        addItem("apple pencake set","apple & toast pencake",false,3.99);

        addItem("banana pencake set","banana & toast pencake",true,4.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }
}
