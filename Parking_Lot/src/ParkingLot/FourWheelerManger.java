package ParkingLot;

import java.util.List;

public class FourWheelerManger extends ParkingSpotManager {
	
	

	public FourWheelerManger(List<ParkingSpot> parkingSpots) {
		super(parkingSpots);
	}

	ParkingSpot findParkingSpace() {
		
		// near by to entrance 
		
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
