package ParkingLot;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EntranceGate {
	
	ParkingSpotManagerFactory factory;
	private static final AtomicInteger ticketCounter = new AtomicInteger(1);

	public EntranceGate(ParkingSpotManagerFactory factory) {
		
		this.factory = factory;
	}
	
	ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> parkingSpots) {
		ParkingSpotManager manager= factory.getParkingSpotManager(vehicleType, parkingSpots);
		return manager.findParkingSpace();
	}
	
	 public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
		 
		 if (parkingSpot == null) {
		        throw new IllegalArgumentException("Cannot generate ticket: no parking spot available.");
		    }

	        int ticketId = ticketCounter.getAndIncrement();
	        long entryTime = System.currentTimeMillis();
	        parkingSpot.setParkingSpaceAvailable(false);; // Mark the spot as occupied
	        return new Ticket(ticketId, entryTime, parkingSpot, vehicle);
	    }
	
	

}
