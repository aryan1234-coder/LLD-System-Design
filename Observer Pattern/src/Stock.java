import Observer.EmailObserver;
import Observer.MobileObserver;
import Observer.NotificationObserver;
import Observerable.IphoneStockObservable;
import Observerable.SamsungPhone;
import Observerable.StockObservable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Stock {
    public static void main(String[] args) {

        StockObservable iphone=new IphoneStockObservable();
        StockObservable samsung=new SamsungPhone();
        NotificationObserver observer1=new MobileObserver("8423956731",iphone);
        NotificationObserver observer2=new EmailObserver("aryansachan2017@gmail.com",iphone);

        NotificationObserver observer3=new MobileObserver("8423956731",samsung);
        NotificationObserver observer4=new EmailObserver("aryansachan2017@gmail.com",samsung);

        iphone.addObserver(observer1);
        iphone.addObserver(observer2);
        samsung.addObserver(observer3);
        samsung.addObserver(observer4);
        iphone.setStock(10);
        samsung.setStock(10);

        }
    }
