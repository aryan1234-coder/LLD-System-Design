import Product.VehicleType;

import java.util.List;

public class Bill {

    //it is against Reservation

    Reservation reservation;
    double price;
    boolean isPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.price = price;
        this.isPaid = false;
    }

    public double ComputeBill(VehicleType vehicleType) {
        if(vehicleType.equals(VehicleType.CAR)){
            return 10000;
        }
        else{
            return 500;
        }
    }

}
