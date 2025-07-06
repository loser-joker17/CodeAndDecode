package LLD.DecoratorPattern.Coffee.ApplyStrategyPattern;

public interface PriceStrategy {
    public double ApplyDiscount(double basePrice, int percentage);
}
