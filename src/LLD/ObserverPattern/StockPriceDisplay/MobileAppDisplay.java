package LLD.ObserverPattern.StockPriceDisplay;


public class MobileAppDisplay  implements Observer{

    private StockMarketStation stockObserverStation;

    public MobileAppDisplay(StockMarketStation stockObserverStation ){
        this.stockObserverStation=stockObserverStation;
    }

    @Override
    public void update(){
        System.out.println("[MobileApp] display Name " + stockObserverStation.getStockName() + " Price is :- " + stockObserverStation.getStockPrice());
    }
}
