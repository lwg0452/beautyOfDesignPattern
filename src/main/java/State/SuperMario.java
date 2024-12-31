package State;

public class SuperMario implements IMario {

    private static final IMario instance = new SuperMario();

    public static IMario getInstance() {
        return instance;
    }

    @Override
    public void obtainMushroom(MarioStateMachine machine) {
        // Nothing to do...
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
        machine.addScore(-100);
        machine.setState(SmallMario.getInstance());
    }
}
