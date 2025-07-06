package LLD.DecoratorPattern.Coffee.ApplyStrategyPattern;

import LLD.DecoratorPattern.Coffee.Coffee;

public class DiscountContext {
    private PriceStrategy priceStrategy;

    public void setDiscountContext(PriceStrategy priceStrategy){
        this.priceStrategy=priceStrategy;
    }

    public double CalculatePrice(Coffee coffee,int percentage){

        return priceStrategy.ApplyDiscount(coffee.getCost(),percentage);
    }
}
