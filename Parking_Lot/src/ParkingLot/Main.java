package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
        // Initialize parking spots
        List<ParkingSpot> spots = new ArrayList<>();
       spots.add(new ParkingSpot(1, true, null, 50, "Entrance"));
       
        spots.add(new ParkingSpot(2, true, null, 40, "A1"));

      
        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();

        // Create EntranceGate and ExitGate objects
        EntranceGate entranceGate = new EntranceGate(factory);
        Exit exitGate = new Exit(factory);

        // Example usage
        Vehicle vehicle = new Vehicle(123, VehicleType.TWOWHELLER);
        ParkingSpot spot = entranceGate.findParkingSpace(vehicle.vehicleType, spots);
     
        Ticket ticket = entranceGate.generateTicket(vehicle, spot);

        // Vehicle leaves
        exitGate.removeVehicle(ticket);
    }

}
