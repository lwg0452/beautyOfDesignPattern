package Decorator;

public class SugarDecorator extends BeverageDecorator{

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.5;
    }
}
