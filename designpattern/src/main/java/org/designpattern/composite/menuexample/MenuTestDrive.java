package org.designpattern.composite.menuexample;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("pencake house menu", "breakfast");
        MenuComponent dinerMenu = new Menu("object house menu","lunch menu");
        MenuComponent caffeMenu = new Menu("caffe menu","caffe menu");
        MenuComponent dessertMenu = new Menu("dessert menu","dessert menu");

        MenuComponent allMenus = new Menu("all menus","all menus");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(caffeMenu);

        caffeMenu.add(new MenuItem("caffe","good coffee",true,2.93));

        dinerMenu.add(new MenuItem(
                "pasta","marietta bread", true, 3.99
        ));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "bread","marietta bread", false, 1.99
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
