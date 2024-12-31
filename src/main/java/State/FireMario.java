package State;

public class FireMario implements IMario {

    private static final FireMario instance = new FireMario();

    public static IMario getInstance() {
        return instance;
    }

    @Override
    public void obtainMushroom(MarioStateMachine machine) {
        // Nothing to do...
    }

    @Override
    public void obtainFireFlower(MarioStateMachine machine) {
        // Nothing to do...
    }

    @Override
    public void obtainCloak(MarioStateMachine machine) {
        // Nothing to do...
    }

    @Override
    public void meetMonster(MarioStateMachine machine) {
        machine.addScore(-300);
        machine.setState(SmallMario.getInstance());
    }
}
