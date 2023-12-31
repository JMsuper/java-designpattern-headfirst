package org.designpattern.iterator.after;

import java.util.ArrayList;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(){
        pancakeHouseMenu = new PancakeHouseMenu();
        dinnerMenu = new DinnerMenu();
    }

    public void printMenu(){
        Iterator pancakeMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();

        System.out.println("------------------ 아침 메뉴 --------------------\n");
        printMenu(pancakeMenuIterator);

        System.out.println("------------------ 점심 메뉴 --------------------\n");
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println();
        }
    }
}
