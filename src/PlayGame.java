import java.util.Scanner;


public class PlayGame
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); // for console input

		boolean done = false;
		while (!done)
		{
			System.out.print("Please enter a command (p, q,): ");
			String input = scanner.nextLine();
			if (input.length() > 0)
			{
				switch (input)
				{

				case "p":
					// Makes sure that the program won't crash if there is
					// an IllegalBinaryTreeOpException
					play(scanner);
					break;

				case "q":
					done = true;
					break;

				default: // ignore invalid commands
					System.out.println("Incorrect command.");
					break;

				}
			}
		}
	}
	public static void play(Scanner scanner)
	{
		Mastermind newGame = new Mastermind();
		String input = "";
		System.out.println("The game is afoot!");
		boolean gameInProgress = true;
		while (gameInProgress)
		{
			System.out.println(newGame.getAnswer().length);
			String[] guess = new String[4];
			for (int i = 1; i <= newGame.getAnswer().length; i++)
			{
				System.out.println("Make a guess for position number " + i);
				input = scanner.nextLine();
				guess[i - 1] = input;
			}
			GuessChecker check = new GuessChecker(newGame);
			check.checkGuess(guess);
			if (check.isWinner())
			{
				System.out.println("You are the Mastermind!");
				gameInProgress = false;
			}
			else
			{
				check.giveResult();
			}
		}
		
	}
}
