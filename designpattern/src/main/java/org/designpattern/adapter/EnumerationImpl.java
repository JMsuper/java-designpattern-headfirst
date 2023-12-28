package org.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class EnumerationImpl<T> implements Enumeration<T>{

    ArrayList<T> list;
    private int idx;

    public EnumerationImpl(List<T> list){
        this.list = new ArrayList<>(list);
        idx = -1;
    }

    @Override
    public boolean hasMoreElements() {
        return list.size() > idx + 1;
    }

    @Override
    public T nextElement() {
        idx++;
        return list.get(idx);
    }

    public void clear(){
        idx = -1;
    }
}
