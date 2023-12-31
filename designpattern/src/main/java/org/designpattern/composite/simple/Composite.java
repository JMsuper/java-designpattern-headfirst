package org.designpattern.composite.simple;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends Component{
    private ArrayList<Component> components = new ArrayList<>();
    private String name;

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void add(Component menuComponent){
        components.add(menuComponent);
    }

    @Override
    public void remove(Component menuComponent){
        menuComponent.remove(menuComponent);
    }

    @Override
    public Component getChild(int i){
        return components.get(i);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void print(){
        System.out.print("\n" + getName());
        System.out.println("=============================");

        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()){
            Component component = iterator.next();
            component.print();
        }
    }

    @Override
    public Iterator<Component> createIterator(int depth) {
        return new CompositeIterator(depth,name,components.iterator());
    }
}
