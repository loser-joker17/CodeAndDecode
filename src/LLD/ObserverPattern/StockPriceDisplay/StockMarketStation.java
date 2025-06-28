package LLD.ObserverPattern.StockPriceDisplay;

import java.util.ArrayList;
import java.util.List;

public class StockMarketStation implements Subject{

    List<Observer> observerList = new ArrayList<>();

    String stockName;
    int stockPrice;

    @Override
    public void add(Observer observer){
        observerList.add(observer);
    }
    @Override
    public void remove(Observer observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(Observer observer1: observerList){
            observer1.update();
        }
    }

    public void setStockNameAndPrice(String stockName , int stockPrice){
        this.stockName=stockName;
        this.stockPrice=stockPrice;
        notifyObserver();
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public String getStockName() {
        return stockName;
    }
}
