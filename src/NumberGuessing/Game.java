package NumberGuessing;

public class Game {
	
	private int TargetNumber=(int)(Math.random() * 100) + 1;
	private int Attempt;
	
	public boolean Guesscheck(int guess)
	{
		Attempt++;
		if(guess<TargetNumber)
		{
			System.out.println("Too Low");
		    return false;
		}
		else if(guess>TargetNumber)
		{
			System.out.println("Too High");
			return false;
		}
		else
		{
			System.out.println("Correct ! Attempts:"+Attempt);
			return true;
		}
	}

}
