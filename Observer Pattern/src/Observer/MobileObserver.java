package Observer;

import Observerable.StockObservable;

public class MobileObserver implements NotificationObserver {

    String mobileNumber;
    StockObservable stockObservable;

    public MobileObserver(String mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;

    }

    public void notifyObservers() {
        sendMail(mobileNumber,"Product are in Stock Hurry Up");
    }
    public void sendMail(String mobileNumber,String message) {
           System.out.println("Sending mail to " + mobileNumber + " " + message);
    }



}
