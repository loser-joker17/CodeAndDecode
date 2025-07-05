package LLD.DecoratorPattern.Coffee;

public class MainClient {
    public  static void main(String args[]){
        Coffee coffee = new PlainCoffee(); // Base

        System.out.println("Coffee Name :- "+ coffee.getDescription());
        System.out.println("Coffee Cost :- "+ coffee.getCost());

        Coffee coffee1 = new MilkDecorator(new PlainCoffee());

        System.out.println("Coffee Name :- "+ coffee1.getDescription());
        System.out.println("Coffee Cost :- "+ coffee1.getCost());

        Coffee coffee2 = new SugarDecorator(new PlainCoffee());
        System.out.println("Coffee Name :- "+ coffee2.getDescription());
        System.out.println("Coffee Cost :- "+ coffee2.getCost());

        Coffee coffee3 = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("Coffee Name :- "+ coffee3.getDescription());
        System.out.println("Coffee Cost :- "+ coffee3.getCost());

        Coffee coffee4 = new ExtraIngredientDecorator(new SugarDecorator(new MilkDecorator(new PlainCoffee())));
        System.out.println("Coffee Name :- "+ coffee4.getDescription());
        System.out.println("Coffee Cost :- "+ coffee4.getCost());
    }
}
