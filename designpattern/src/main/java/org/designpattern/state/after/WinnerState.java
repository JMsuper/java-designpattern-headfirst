package org.designpattern.state.after;

public class WinnerState extends State{

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void dispense() {
        System.out.println("축하드립니다! 알멩이를 하나 더 받으실 수 있습니다.");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuareterState());
            }else {
                System.out.println("더 이상 알멩이가 없습니다.");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
