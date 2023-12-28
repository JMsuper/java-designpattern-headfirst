package org.designpattern.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterRunner {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(List.of(new Integer[]{1, 2, 3, 4, 5}));

        {
            Enumeration<Integer> enumeration = new EnumerationImpl<Integer>(integerList);
            System.out.println("Enumeration\n" + enumeration.getClass().getName());
            while(enumeration.hasMoreElements()) System.out.print(enumeration.nextElement());
        }
        {
            Iterator<Integer> iterator = new IteratorImpl<Integer>(integerList);
            System.out.println("\n\nIterator\n" + iterator.getClass().getName());
            while (iterator.hasNext()) System.out.print(iterator.next());
        }
        {
            Iterator<Integer> enumerationIterator = new EnumerationIterator<Integer>(new EnumerationImpl<Integer>(integerList));
            System.out.println("\n\nenumerationIterator\n" + enumerationIterator.getClass().getName());
            while (enumerationIterator.hasNext()) System.out.print(enumerationIterator.next());
        }

    }
}
