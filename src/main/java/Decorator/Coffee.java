package Decorator;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
