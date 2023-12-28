package org.designpattern.adapter;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove(T t);
}
