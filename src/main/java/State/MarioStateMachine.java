package State;

public class MarioStateMachine {

    private int score;
    private IMario state;

    public MarioStateMachine() {
        score = 0;
        state = SmallMario.getInstance();
    }

    public void obtainMushroom() {
        state.obtainMushroom(this);
    }

    public void obtainFireFlower() {
        state.obtainFireFlower(this);
    }

    public void obtainCloak() {
        state.obtainCloak(this);
    }

    public void meetMonster() {
        state.meetMonster(this);
    }

    public int getScore() {
        return score;
    }

    public IMario getState() {
        return state;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public void setState(IMario state) {
        this.state = state;
    }
}
