
public class MastermindTesterClass
{

	public static void main(String[] args)
	{
		int color = 1 + (int) (Math.random() * 4);
		System.out.println(color);
		
		Mastermind game = new Mastermind();

		String[] guess = new String[4];
		guess[0] = "Black";
		guess[1] = "Blue";
		guess[2] = "Blue";
		guess[3] = "Blue";
		GuessChecker check = new GuessChecker(game);
		check.checkGuess(guess);
		check.giveResult();
		boolean done = false;
		while (!done)
		{
			for (int i = 0; i < guess.length; i++)
			{
				System.out.print("Carrots");
			}
			done = true;
		}
	}

}
