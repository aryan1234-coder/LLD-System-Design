package Mediator;

public class Bidder {
	
	private String name;
	private MediatorAuction mediatorAuction;
	
	public Bidder(String name, MediatorAuction mediatorAuction) {
	
		this.name = name;
		this.mediatorAuction = mediatorAuction;
	}
	
	public String getName() {
		 return name;
		 
	}
	
	public void placeBid(Bidder bidder,int amount) {
		mediatorAuction.placeBid(bidder, amount);
	}
	
	public void receiveBid(Bidder bidder, int amount) {
	    System.out.println(name + " is notified: " + bidder.getName() +
                " placed a bid of " + amount);
}
	
	
	

}
