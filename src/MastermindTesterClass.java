import java.util.ArrayList;


public class MastermindTesterClass
{

	public static void main(String[] args)
	{
		int color = 1 + (int) (Math.random() * 4);
		System.out.println(color);
		
		Mastermind game = new Mastermind();

		String[] guess = new String[4];
		guess[0] = "Blue";
		guess[1] = "Black";
		guess[2] = "Red";
		guess[3] = "Yellow";
		Peg[] fake = new Peg[4];
		fake[0] = new Peg("Blue");
		fake[1] = new Peg("Red");
		fake[2] = new Peg("Red");
		fake[3] = new Peg("Red");
		GuessChecker check = new GuessChecker(game);
		check.checkGuess2(guess, fake);
		check.giveResult();
	}

}
