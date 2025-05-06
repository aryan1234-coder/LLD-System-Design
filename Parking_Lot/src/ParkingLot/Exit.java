package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Exit {


	ParkingSpotManagerFactory  parkingSpotManagerFactory;

	public Exit(ParkingSpotManagerFactory parkingSpotManagerFactory) {
		this.parkingSpotManagerFactory = parkingSpotManagerFactory;
	}
	
	void removeVehicle(Ticket ticket) {
		ParkingSpotManager manager= parkingSpotManagerFactory.getParkingSpotManager(ticket.vehicle.vehicleType, new ArrayList<>());
		
			manager.removeVehicle(ticket.vehicle);
			ticket.parkingSpot.isParkingSpaceAvailable=true;
			
			long exitTime=System.currentTimeMillis();
			 long durationMillis = exitTime - ticket.entryTime;
		        long durationMinutes = durationMillis / (1000 * 60);

		        double price = calculatePrice(durationMinutes);
		        System.out.println("Vehicle exited. Duration: " + durationMinutes + " minutes. Price: ₹" + price);
			
			
		
	}

    private double calculatePrice(long durationMinutes) {
     
        if (durationMinutes <= 60) {
            return 20.0;
        } else {
            return 20.0 + (durationMinutes - 60) * 1.0;
        }
    }
	
	

}
