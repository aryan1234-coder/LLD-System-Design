package SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
	
	
	private Board board;
	private Dice dice;
	private Deque<Player> players;
	private Player winner;
	
	
	public Game() {
		initializeGame();
	}
	
	private void initializeGame() {
		board=new Board(10,5,5);
		dice=new Dice(1);
		players=new LinkedList<>();
		winner=null;
		
		addPlayer();
		
	}
	private void addPlayer() {
		Player player1=new Player("Aryan",0);
		Player player2=new Player("Yash",0);
		players.add(player1);
	    players.add(player2);
		
	}
	
	public void startGame() {
		int finalCell=board.getboardSize() * board.getboardSize()-1;
		
		while(winner==null) {
			Player currentPlayer=players.pollFirst();
			
//			assert currentPlayer != null;

            System.out.println("\nPlayer turn: " + currentPlayer.getId() + ", Current position: " + currentPlayer.getCurrentPosition());
            
            int diceRoll=dice.rollDice();
            
            int nextPosition=currentPlayer.getCurrentPosition() + diceRoll;
            
            if(nextPosition> finalCell) {
            	System.out.println("Try it Again");
            	
            }
            
            else {
            	nextPosition=processJump(nextPosition);
            	currentPlayer.setCurrentPosition(nextPosition);
            	System.out.println("New position: " + nextPosition);
            	  if (nextPosition == finalCell) {
                      winner = currentPlayer;
                      break;
                  }
            }
            players.offerLast(currentPlayer);
		
		}
		
		System.out.println("WINNER IS:" + winner.id);
		
			
		}
	private int processJump(int position) {
		
		Cell cell=board.getCell(position);
		if(cell.getJump()!=null) {
			Jump jump=cell.getJump();
			String jumpType=(jump.getStart()< jump.getEnd()) ? "Ladder" : "Snake";
			System.out.println("HEllo "  + jumpType + " from " + jump.getStart() + " to " + jump.getEnd());
            return jump.getEnd();
            // every time if snake bitten then you came to to end position and ladder found you get on end position
		}
		return position;
				
	
	}
	

}
