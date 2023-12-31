package org.designpattern.state.before;

public class GumballMachine {
    private static final int SOLD_OUT = 0;
    private static final int NO_QUARTER = 1;
    private static final int HAS_QUARTER = 2;
    private static final int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("동전은 한 개만 넣어주세요");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
        } else if (state == SOLD) {
            System.out.println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.");
        }
    }

    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("이미 알멩이를 뽑으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않았습니다. 동전이 반환되지 않습니다.");
        }
    }

    public void turnCrank(){
        if(state == SOLD){
            System.out.println("손잡이는 한번만 돌려주세요.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispence();
        }
    }

    public void dispence(){
        if(state == SOLD){
            System.out.println("알멩이가 나가고 있습니다.");
            count = count - 1;
            if(count == 0){
                System.out.println("더이상 알멩이가 없습니다.");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("알멩이가 나갈 수 없습니다.");
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("남은 개수 : " + this.count + System.lineSeparator());
        sb.append("상태 : ");
        String stateString = "";
        if(state == NO_QUARTER){
            stateString = "동전 투입 대기중";
        } else if (state == HAS_QUARTER) {
            stateString = "동전 투입 완료";
        } else if (state == SOLD) {
            stateString = "판매 진행중";
        } else if (state == SOLD_OUT) {
            stateString = "매진";
        }
        sb.append(stateString);

        return sb.append(System.lineSeparator()).toString();
    }
}
