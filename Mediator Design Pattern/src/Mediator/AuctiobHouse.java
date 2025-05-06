package Mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctiobHouse implements MediatorAuction{
	
	private
	  List<Bidder> bidders = new ArrayList<>();

	  @Override public void registerBide(Bidder bidder) {
	    bidders.add(bidder);
	  }

	  @Override public void placeBid(Bidder bidder, int amount) {
	    System.out.println(bidder.getName() + " placed a bid of " + amount);
	    for (Bidder b : bidders) {
	      if (b != bidder) {
	        b.receiveBid(bidder, amount);
	      }
	    }
	  } 
	
	

}
