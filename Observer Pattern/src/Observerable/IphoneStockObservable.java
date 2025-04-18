package Observerable;

import java.util.ArrayList;
import java.util.List;
import Observer.NotificationObserver;

public class IphoneStockObservable implements StockObservable{

    public List<NotificationObserver> observers = new ArrayList<NotificationObserver>();
    int stockCounter = 0;

    public void addObserver( NotificationObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (NotificationObserver observer : observers) {
            observer.notifyObservers();
        }
    }

    public void setStock(int newStockAdded) {
        if(stockCounter==0) {
            notifyObservers();
        }
        stockCounter += newStockAdded;
    }

    @Override
    public int getStock() {
        return stockCounter;
    }
}
