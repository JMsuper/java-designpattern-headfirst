package org.designpattern.state.after;

public abstract class State {
    public void insertQuarter(){
        System.out.println("잘못된 요청입니다.");
    };
    public void ejectQuarter(){
        System.out.println("잘못된 요청입니다.");
    };
    public boolean turnCrank(){
        System.out.println("잘못된 요청입니다.");
        return false;
    };
    public void dispense(){
        System.out.println("잘못된 요청입니다.");
    };
}
