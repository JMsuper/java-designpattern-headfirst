package org.designpattern.state.after;

import java.util.Random;

public class HasQuarterState extends State{
    private Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한 개만 넣어주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuareterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("손잡이를 돌리셨습니다.");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        return true;
    }

    @Override
    public String toString() {
        return "HasQuarterState";
    }
}
