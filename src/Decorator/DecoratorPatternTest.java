package Decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());

        Beverage milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription());
        System.out.println(milkCoffee.cost());

        Beverage sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription());
        System.out.println(sugarMilkCoffee.cost());
    }
}
