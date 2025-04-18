import Product.Vehicle;
import Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeID;
    String storeName;

    VehicleInventoryManagement vehicleInventoryManagement;
    Location location;
    List<Reservation> reservations=new ArrayList<>();

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventoryManagement.getVehicles();

    }

 public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);


 }
    public Reservation createReservation(User user,Vehicle vehicle) {
        Reservation reservation = new Reservation();
        reservation.createReservation(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {
         return true;

    }

}
