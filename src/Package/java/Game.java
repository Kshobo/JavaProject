package Package.java;


import java.util.Scanner;// used to read user input
import java.util.Random; // uses to generate random number

public class Game {
	
	private int guesses;
	private int victory = 0;
	private int target;
	private int input;
	
	public Game(int guesses)
	{
		setguesses(guesses);	
	}
	
	public void generatenum ()
	{
		Random rand = new Random();
		target = rand.nextInt(100) +1;// change this.target to target
	}
	
	public void play()
	{
		System.out.println("Welcome to The Standard number guessing game");
		System.out.println("Pick a number between 1 and 100");
		
		while(this.guesses > 0 && this.victory <1)	
		{
			Scanner myObj = new Scanner(System.in);
			input = myObj.nextInt();
			
			if (this.input == target)
			{
				System.out.println("You win");
				victory +=1;
				myObj.close();

			}
			
			if (this.input != target)
			{
				if (input< target)
				{
					System.out.println("Higher");
				}
				if (input> target)
				{
					System.out.println("Lower");
				}
			}
			guesses -=1;
		}
	}
	
	public int gettarget()
	{
		return target;
	}
	
	public void setguesses(int guesses)
	{
		this.guesses = guesses;
	}
	

}



