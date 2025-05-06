package Facade;
import java.util.Scanner;
public class Facade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MediaFacade mediaFacade=new MediaFacade();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Media Player App");
		System.out.println("Choose an actions like:  playMusic,videoPlayers,imageViewers");
		
		String action=sc.nextLine();
		mediaFacade.performAction(action);

		
		
		

	}

}
