import Product.Vehicle;
import Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle>  vehicles;


 public VehicleInventoryManagement(List<Vehicle> vehicles) {
    vehicles=new ArrayList<>();
 }



    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    
    public void addVehicle(Vehicle v) {
    	vehicles.add(v);
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
