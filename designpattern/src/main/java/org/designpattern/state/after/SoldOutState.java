package org.designpattern.state.after;

public class SoldOutState extends State{

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("판매가 종료되었습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("판매가 종료되었습니다.");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("판매가 종료되었습니다.");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("판매가 종료되었습니다.");
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
