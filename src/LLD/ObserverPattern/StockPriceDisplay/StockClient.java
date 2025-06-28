package LLD.ObserverPattern.StockPriceDisplay;

public class StockClient {
    public static void main(String args[]){

        StockMarketStation stockObserverStation = new StockMarketStation();

        stockObserverStation.add(new MobileAppDisplay(stockObserverStation));
        stockObserverStation.add(new EmailAlert(stockObserverStation));
        stockObserverStation.add(new AnalyticsDashBoard(stockObserverStation));

        stockObserverStation.setStockNameAndPrice("TCS",3588);
        System.out.println();
        stockObserverStation.setStockNameAndPrice("INFOSYS",1540);
        System.out.println();

        stockObserverStation.setStockNameAndPrice("TCS",3650);

    }
}
