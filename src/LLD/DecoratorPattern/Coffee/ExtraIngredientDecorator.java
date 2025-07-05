package LLD.DecoratorPattern.Coffee;

public class ExtraIngredientDecorator extends CoffeeDecorator{
    public ExtraIngredientDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " With Extra Ingredient";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 30.0;
    }
}
