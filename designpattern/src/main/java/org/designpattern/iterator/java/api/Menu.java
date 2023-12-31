package org.designpattern.iterator.java.api;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
