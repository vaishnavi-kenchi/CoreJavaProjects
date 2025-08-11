package NumberGuessing;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Game game=new Game();
		boolean iscorrect=false;
		
		System.out.println("Welcome to Number Guessing Game...!!");
		System.out.println("guess a Number between 1 to 100");
		
		while(!iscorrect)
		{
			System.out.println("Enter your guess");
	        int guess=sc.nextInt();
		    iscorrect=game.Guesscheck(guess);
		}
	}

}
