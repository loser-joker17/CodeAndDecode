package LLD.DecoratorPattern.Coffee;

public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "PlainCoffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
