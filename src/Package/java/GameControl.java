package Package.java;

import java.util.Scanner;// used to read user input

public class GameControl {
	
	public static void main(String []args)
	{	
		int input;

		
		System.out.println("Choose a game mode \n 1. Standard Number Guessing Game \n 2. Hinted Number Guessing Game\n Enter your choice (1 or 2):\n");
		Scanner myObj = new Scanner(System.in);
		input = myObj.nextInt();
				
		if (input == 1)
		{
			Game game1 = new Game(10);
			game1.generatenum();
			game1.play();
			myObj.close();

		}
		
		
	}
}
