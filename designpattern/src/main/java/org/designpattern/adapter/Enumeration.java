package org.designpattern.adapter;

public interface Enumeration<T> {
    boolean hasMoreElements();
    T nextElement();
}
