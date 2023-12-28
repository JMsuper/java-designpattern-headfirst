package org.designpattern.adapter;

public class EnumerationIterator<T> implements Iterator{
    private Enumeration<T> enumeration;

    public EnumerationIterator(Enumeration<T> enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove(Object o) {}
}
