package Observer;

import Observerable.StockObservable;

public class EmailObserver implements  NotificationObserver{


    String emailId;
    StockObservable stockObservable;

    public EmailObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;

    }

    public void notifyObservers() {
        sendMail(emailId,"Product are in Stock Hurry Up");
    }
    public void sendMail(String emailId,String message) {
        System.out.println("Sending mail to " + emailId + " " + message);
    }

}
