package State;

public class CloakMario implements IMario{

    private static final CloakMario instance = new CloakMario();

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
        machine.addScore(-200);
        machine.setState(SmallMario.getInstance());
    }
}
