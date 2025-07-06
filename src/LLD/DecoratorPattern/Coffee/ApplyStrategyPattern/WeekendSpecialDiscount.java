package LLD.DecoratorPattern.Coffee.ApplyStrategyPattern;

public class WeekendSpecialDiscount implements PriceStrategy {
    @Override
    public double ApplyDiscount(double basePrice, int percentage) {
        double finalPrice = basePrice- (basePrice * percentage)/100;
        return finalPrice;
    }
}
