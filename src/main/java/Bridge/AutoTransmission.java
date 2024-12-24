package Bridge;

public class AutoTransmission implements Transmission{
    @Override
    public void showTransmission() {
        System.out.println("I am automatic transmission.");
    }
}
