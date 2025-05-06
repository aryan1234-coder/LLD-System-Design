package GuessWord;

import java.util.Scanner;

public class Player {
	
	private String name;
	private Scanner sc=new Scanner(System.in);
	public Player(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public char makeGuess() {
		System.out.print(name + ", enter your guess: ");
        return sc.nextLine().toLowerCase().charAt(0);
	}
	
	
		
	
	
	

}
