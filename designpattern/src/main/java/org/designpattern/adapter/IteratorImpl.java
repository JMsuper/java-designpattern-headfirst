package org.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class IteratorImpl<T> implements Iterator<T>{
    private ArrayList<T> list;
    private int idx;

    public IteratorImpl(List list){
        this.list = new ArrayList<>(list);
        idx = -1;
    }

    @Override
    public boolean hasNext() {
        return list.size() > idx + 1;
    }

    @Override
    public T next() {
        idx++;
        return list.get(idx);
    }

    @Override
    public void remove(T element) {
        int otherIdx = list.indexOf(element);
        if(otherIdx > -1){
            list.remove(element);
        }
        if(otherIdx >= idx){
            idx--;
        }
    }
}
