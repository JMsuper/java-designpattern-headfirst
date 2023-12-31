package org.designpattern.state.after;

public class NoQuarterState extends State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("동전을 넣어주세요.");
        return false;
    }


    @Override
    public String toString() {
        return "NoQuarterState";
    }
}
