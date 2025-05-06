package Mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediatorAuction auctionHouse = new AuctiobHouse();
	    Bidder bidder1 = new Bidder("Alice", auctionHouse);
	    Bidder bidder2 = new Bidder("Bob", auctionHouse);
	    Bidder bidder3 = new Bidder("Charlie", auctionHouse);
	    auctionHouse.registerBide(bidder1);
	    auctionHouse.registerBide(bidder2);
	    auctionHouse.registerBide(bidder3);
	    bidder1.placeBid(bidder1,100);
	    bidder2.placeBid(bidder2,150);
	    bidder3.placeBid(bidder3,200);

	}

}
