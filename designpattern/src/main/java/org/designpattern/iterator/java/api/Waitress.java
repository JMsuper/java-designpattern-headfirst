package org.designpattern.iterator.java.api;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;

    public Waitress(){
        pancakeHouseMenu = new PancakeHouseMenu();
        dinnerMenu = new DinnerMenu();
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.createIterator();

        System.out.println("------------------ 아침 메뉴 --------------------\n");
        printMenu(pancakeMenuIterator);

        System.out.println("------------------ 점심 메뉴 --------------------\n");
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println();
        }
    }
}
