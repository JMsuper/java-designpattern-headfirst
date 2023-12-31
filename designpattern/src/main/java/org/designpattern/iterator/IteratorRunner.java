package org.designpattern.iterator;


import org.designpattern.iterator.after.Waitress;

public class IteratorRunner {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();

        waitress.printMenu();
    }
}
