package org.designpattern.state.after;

public class GumballMachine {

    private State soldOutState;
    private State noQuareterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuareterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if(numberGumballs > 0){
            this.state = noQuareterState;
        }
    }

    public void insertQuarter(){
        System.out.print("insertQuarter : ");
        state.insertQuarter();
    }

    public void ejectQuarter(){
        System.out.print("ejectQuarter : ");
        state.ejectQuarter();
    }

    public void turnCrank(){
        System.out.print("turnCrank : ");
        if (state.turnCrank())
            state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count -= 1;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("남은 개수 : " + this.count + System.lineSeparator());
        sb.append("상태 : ");
        String stateString = "";
        sb.append(this.state.toString());
        sb.append(stateString);

        return sb.append(System.lineSeparator()).toString();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuareterState() {
        return noQuareterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState(){return winnerState;}

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }
}
