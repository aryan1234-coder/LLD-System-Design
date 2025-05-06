package ParkingLot;

public class Ticket {
	
	int ticketId;
	long entryTime;
	ParkingSpot parkingSpot;
	Vehicle vehicle;
	
	public Ticket(int ticketId, long entryTime, ParkingSpot parkingSpot, Vehicle vehicle) {
		this.ticketId = ticketId;
		this.entryTime = entryTime;
		this.parkingSpot = parkingSpot;
		this.vehicle = vehicle;
	}
	
	

}
