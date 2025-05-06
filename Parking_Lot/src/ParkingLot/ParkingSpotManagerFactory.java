package ParkingLot;

import java.util.List;

public class ParkingSpotManagerFactory {
	
	ParkingSpotManager getParkingSpotManager(VehicleType vehicleType,List<ParkingSpot> spots) {
		
		if(vehicleType==VehicleType.FOURWHEELER) {
			return new FourWheelerManger(spots);
			
		}
		else if(vehicleType==VehicleType.TWOWHELLER) {
			return new TwoWheelerManger(spots);
		}
		return null;
		
	}

}
