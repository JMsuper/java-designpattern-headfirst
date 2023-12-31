package org.designpattern.iterator.java.api;

import java.util.Arrays;
import java.util.Iterator;

public class DinnerMenu implements Menu{
    public static final int MAX_ITEMS = 6;
    public int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("K&B dinner set","egg & toast dinner",true,2.99);

        addItem("apple dinner set","apple & toast dinner",false,3.99);

        addItem("banana dinner set","banana & toast dinner",false,4.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);

        if(numberOfItems >= MAX_ITEMS){
            System.out.println("menu is full");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator<MenuItem> createIterator(){
        return Arrays.stream(menuItems).iterator();
    }

}
