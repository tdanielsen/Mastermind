import java.util.ArrayList;


public class MastermindTesterClass
{

	public static void main(String[] args)
	{
		int color = 1 + (int) (Math.random() * 4);
		System.out.println(color);
		
		Mastermind game = new Mastermind();

		String[] guess = new String[4];
		guess[0] = "red";
		guess[1] = "yellow";
		guess[2] = "yellow";
		guess[3] = "yellow";
		Peg[] fake = new Peg[4];
		fake[0] = new Peg("red");
		fake[1] = new Peg("yellow");
		fake[2] = new Peg("yellow");
		fake[3] = new Peg("yellow");
		GuessChecker check = new GuessChecker(game);
		check.checkGuess2(guess, fake);
		check.giveResult();
		String input = "Black";
		System.out.println(!input.equalsIgnoreCase("Blue"));
	}

}
