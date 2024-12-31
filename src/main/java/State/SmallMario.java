package State;

public class SmallMario implements IMario {

    private static final IMario instance = new SmallMario();

    public static IMario getInstance() {
        return instance;
    }

    @Override
    public void obtainMushroom(MarioStateMachine machine) {
        machine.addScore(100);
        machine.setState(SuperMario.getInstance());
    }

    @Override
    public void obtainFireFlower(MarioStateMachine machine) {
        machine.addScore(300);
        machine.setState(FireMario.getInstance());

    }

    @Override
    public void obtainCloak(MarioStateMachine machine) {
        machine.addScore(200);
        machine.setState(CloakMario.getInstance());
    }

    @Override
    public void meetMonster(MarioStateMachine machine) {
        // Nothing to do...
    }
}
