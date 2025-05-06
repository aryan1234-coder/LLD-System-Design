package ParkingLot;

public class ParkingSpot {
	
	int parkingId;
	boolean isParkingSpaceAvailable;
	Vehicle vehicle;
	int price;
	String location;
	
	public ParkingSpot(int parkingId, boolean isParkingSpaceAvailable, Vehicle vehicle, int price,String location) {
	
		
		this.parkingId = parkingId;
		this.isParkingSpaceAvailable = true;
		this.vehicle = vehicle;
		this.price = price;
		this.location=location;
		
	}
	
	public ParkingSpot(int i) {
		// TODO Auto-generated constructor stub
		this.parkingId=i;
	}

	public void parkVehicle(Vehicle v) {
		this.vehicle=v;
		isParkingSpaceAvailable=false;
	}
	
	public void removeVehicle(Vehicle v) {
		this.vehicle=null;
		isParkingSpaceAvailable=true;
		
	}

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public boolean isParkingSpaceAvailable() {
		return isParkingSpaceAvailable;
	}

	public void setParkingSpaceAvailable(boolean isParkingSpaceAvailable) {
		this.isParkingSpaceAvailable = isParkingSpaceAvailable;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	

}
