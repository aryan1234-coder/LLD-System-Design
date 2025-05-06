package SnakeLadder;

import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
	
	Cell[][] cells;
	
	int boardSize;

	Board(int boardSize,int numberOfSnake,int numberOfLadder) {
	
		
		this.boardSize=boardSize;
		initializeCells(boardSize);
		addSnakesAndLadder(numberOfSnake,numberOfLadder);
		
	}
	private void initializeCells(int boardSize) {
		
		cells=new Cell[boardSize][boardSize];
		
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				
				cells[i][j]=new Cell();
				
			}
		}
		
		
	}
	
	private void addSnakesAndLadder(int numberOfSnake,int numberOfLadder ) {
		
		HashSet<Integer> usedPositions=new HashSet<>();
		
		while(numberOfSnake>0) {
			
			int start=ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
			int end =ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
			
			// for Snakes we know that head of Snakes should be greater
			
			if(end >= start  || usedPositions.contains(start)) {
				continue;
			}
			
			getCell(start).setJump(new Jump(start,end));
			usedPositions.add(start);
			numberOfSnake--;
		}
		
          while(numberOfLadder>0) {
			
			int start=ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
			int end =ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
			
			// for Ladder  we know that head of Snakes should be greater enad>=start
			//yuuurtut
			
			if( start>=end  || usedPositions.contains(start)) {
				continue;
			}
			
			getCell(start).setJump(new Jump(start,end));
			usedPositions.add(start);
			numberOfLadder--;
		}
		
		
		
	}
	public Cell getCell(int position) {
		
		int row= position/ boardSize;
		
		int col=position % boardSize;
		return cells[row][col];
	}
	public int getboardSize() {
		return boardSize;
	}
	
	
	
	

}
