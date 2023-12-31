package org.designpattern.iterator.before;

import java.util.ArrayList;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;
    private ArrayList breakfastItems;
    private MenuItem[] lunchItems;

    public Waitress(){
        pancakeHouseMenu = new PancakeHouseMenu();
        this.breakfastItems = pancakeHouseMenu.getMenuItems();

        dinnerMenu = new DinnerMenu();
        this.lunchItems = dinnerMenu.getMenuItems();
    }

    public void printMenu(){
        for (int i = 0; i < breakfastItems.size(); i++){
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println();
        }

        for (int i = 0; i < dinnerMenu.numberOfItems; i++){
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println();
        }
    }

    public void printBreakfastMenu(){
        for (int i = 0; i < breakfastItems.size(); i++){
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println();
        }
    }

    public void printLunchMenu(){
        for (int i = 0; i < dinnerMenu.numberOfItems; i++){
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println();
        }
    }

    public void printVegetarianMenu(){
        for (int i = 0; i < breakfastItems.size(); i++){
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            if(menuItem.isVegetarian()){
                System.out.println(menuItem.getName());
                System.out.println(menuItem.getPrice());
                System.out.println(menuItem.getDescription());
                System.out.println();
            }
        }

        for (int i = 0; i < dinnerMenu.numberOfItems; i++){
            MenuItem menuItem = lunchItems[i];
            if(menuItem.isVegetarian()){
                System.out.println(menuItem.getName());
                System.out.println(menuItem.getPrice());
                System.out.println(menuItem.getDescription());
                System.out.println();
            }
        }
    }

    public boolean isItemVegetarian(String name){
        for (int i = 0; i < breakfastItems.size(); i++){
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            if(menuItem.getName().equals(name)){
                return menuItem.isVegetarian();
            }
        }

        for (int i = 0; i < dinnerMenu.numberOfItems; i++){
            MenuItem menuItem = lunchItems[i];
            if(menuItem.getName().equals(name)){
                return menuItem.isVegetarian();
            }
        }
        return false;
    };
}
