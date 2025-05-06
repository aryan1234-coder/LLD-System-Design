package SnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	
	private int diceCount;
	private final int min=1;
	private final int max=6;
	public Dice(int diceCount) {
		
		this.diceCount = diceCount;
	}
	
	public int  rollDice() {
		
		int stepGone=0;
		int rolls=0;
		int consecutiveSix=0;
		
		
		while(rolls<diceCount) {
			
			int diceRoll = ThreadLocalRandom.current().nextInt(min, max + 1);
	        System.out.println("Rolled: " + diceRoll);
	        if (diceRoll == 6) {
	            consecutiveSix++;
	            if (consecutiveSix == 3) {
	                System.out.println("Three consecutive 6s! Turn skipped.");
	                return 0; // skip turn
	            }
	            stepGone += diceRoll;
	            // don't increment rolls to allow another chance
	        }
	        else {
	        	 stepGone += diceRoll;
	             rolls++;
	             consecutiveSix = 0;
	        	
	        }
			
		}
		return stepGone;
	}
	
	

}
