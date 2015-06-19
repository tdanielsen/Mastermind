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
		guess[1] = " yellow";
		guess[2] = " blue";
		guess[3] = " black";
		Peg[] fake = new Peg[4];
		fake[0] = new Peg("red");
		fake[1] = new Peg("red");
		fake[2] = new Peg("blue");
		fake[3] = new Peg("red");
		GuessChecker check = new GuessChecker(game);
		check.checkGuess2(guess, fake);
		check.giveResult();
		String input = "Black";
//		System.out.println(!input.equalsIgnoreCase("Blue"));
		String h = " Happy";
		h.toUpperCase();
		System.out.print(guess[1].toLowerCase().contains(fake[0].checkColor()));
	}

}
