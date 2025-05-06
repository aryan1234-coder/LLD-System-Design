package Mediator;

public interface MediatorAuction {
	
	void registerBide(Bidder bidder);
	
	void placeBid(Bidder bidder,int amount);
	
}
