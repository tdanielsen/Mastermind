import java.util.Scanner;


public class PlayGame
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); // for console input

		boolean done = false;
		while (!done)
		{
			System.out.print("Please enter a command (p, h, q,): ");
			String input = scanner.nextLine();
			if (input.length() > 0)
			{
				switch (input)
				{

				case "p":
					play(scanner);
					break;
				
				case "h":
					System.out.println("How to Play:");
					System.out.println("Guess what the computer made as an answer by typing, when prompted,");
					System.out.println("'Blue', 'Yellow', 'Black', or 'Red'. Are you a mastermind?");
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
			String[] guess = new String[4];
			for (int i = 1; i <= newGame.getAnswer().length; i++)
			{
				System.out.println("Make a guess for position number " + i);
				input = scanner.nextLine();
				if (input.equalsIgnoreCase("Give up"))
				{
					for (int j = 0; j < newGame.getAnswer().length; j++)
					{
						System.out.println(newGame.getAnswer()[j].checkColor());
					}
					gameInProgress = false;
					break;
				}
				guess[i - 1] = input;
			}
			if (gameInProgress == false)
			{
				break;
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
				System.out.println("Guess again!");
			}
		}
		
	}
}
