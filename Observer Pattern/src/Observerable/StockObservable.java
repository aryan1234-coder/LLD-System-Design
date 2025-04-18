package Observerable;

import Observer.NotificationObserver;

public interface  StockObservable {

    public void addObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public void setStock(int newStockAdded);
    public int getStock();
}
