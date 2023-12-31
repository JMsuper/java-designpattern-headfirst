package org.designpattern.iterator.after;

public class DinnerMenuIterator implements Iterator{
    private MenuItem[] items;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
