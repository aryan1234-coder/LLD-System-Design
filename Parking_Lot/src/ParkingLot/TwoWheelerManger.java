package ParkingLot;

import java.util.List;

public class TwoWheelerManger extends ParkingSpotManager {

	public TwoWheelerManger(List<ParkingSpot> parkingSpots) {
		super(parkingSpots);
	}
	
	

	ParkingSpot findParkingSpace() {
		
		for(ParkingSpot spot: parkingSpots) {
			
			if(spot.isParkingSpaceAvailable==true && "Entrance".equalsIgnoreCase(spot.getLocation())) {
				
				return spot;
			}
		}
		
		for(ParkingSpot spot: parkingSpots) {
			if(spot.isParkingSpaceAvailable) {
				return spot;
			}
		}
		return null;
	}
}
