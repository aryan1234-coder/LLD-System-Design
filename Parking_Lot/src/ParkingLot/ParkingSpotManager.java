package ParkingLot;

import java.util.List;

public abstract class ParkingSpotManager {
	
	
	List<ParkingSpot> parkingSpots;

	public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
		
		this.parkingSpots = parkingSpots;
	}
	
	abstract ParkingSpot findParkingSpace();
	
	void parkVehicle(Vehicle v) {
		ParkingSpot spot= findParkingSpace();
		spot.parkVehicle(v);
	}
	void removeVehicle(Vehicle v) {
		for(ParkingSpot spot: parkingSpots) {
			if(spot.vehicle!=null && spot.vehicle.equals(v)) {
				spot.removeVehicle(v);
				break;
			}
		}
	}
	
	
	
	

}
