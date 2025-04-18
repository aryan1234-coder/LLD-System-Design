package Observerable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungPhone implements StockObservable {

    List<NotificationObserver> list=new ArrayList<>();

    int stackcountinitial=0;

    public void addObserver(NotificationObserver observer) {

        list.add(observer);

    }
    public void removeObserver(NotificationObserver observer) {
         list.remove(observer);
    }

    public void notifyObservers() {
        for (NotificationObserver observer : list) {
            observer.notifyObservers();
        }
    }

    public void setStock(int newStockAdded) {
        if(stackcountinitial==0) {
            notifyObservers();
        }
        stackcountinitial += newStockAdded;
    }

    @Override
    public int getStock() {
        return stackcountinitial;
    }




}
