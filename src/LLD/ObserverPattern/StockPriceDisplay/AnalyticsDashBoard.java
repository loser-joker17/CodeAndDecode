package LLD.ObserverPattern.StockPriceDisplay;

public class AnalyticsDashBoard implements Observer{

    private StockMarketStation stockObserverStation;

    public AnalyticsDashBoard(StockMarketStation stockObserverStation){
        this.stockObserverStation=stockObserverStation;
    }

    @Override
    public void update(){
        System.out.println("[Analytics] Stock Recorded at :- " + stockObserverStation.getStockName() + " Price is :- " + stockObserverStation.getStockPrice());
    }
}
