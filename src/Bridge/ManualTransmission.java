package Bridge;

public class ManualTransmission implements Transmission {
    @Override
    public void showTransmission() {
        System.out.println("I am manual transmission.");
    }
}
