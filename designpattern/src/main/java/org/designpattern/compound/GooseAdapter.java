package org.designpattern.compound;

public class GooseAdapter implements Quackable{
    private Goose goose;
    Observable observable = new Observable(this);

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

}
