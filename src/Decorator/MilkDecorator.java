package Decorator;

public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1;
    }
}
