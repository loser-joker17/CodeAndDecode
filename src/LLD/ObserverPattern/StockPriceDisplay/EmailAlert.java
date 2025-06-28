package LLD.ObserverPattern.StockPriceDisplay;

public class EmailAlert implements Observer {

    private StockMarketStation stockObserverStation;

    public EmailAlert(StockMarketStation stockObserverStation){
        this.stockObserverStation=stockObserverStation;
    }
    @Override
    public void update(){
        if(stockObserverStation.getStockPrice() > 3600){
            System.out.println("[EmailAlert] " + stockObserverStation.getStockName() + " crossed ₹3500! Current: ₹" + stockObserverStation.getStockPrice());
        }
    }
}
