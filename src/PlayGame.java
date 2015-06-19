import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;


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
					System.out.println("A white result means that you guessed the right colour but it is in the wrong place.");
					System.out.println("A black result means that you guessed the right colour in the right place!");
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
		GuessChecker check = new GuessChecker(newGame);
		String input = "";
		int count = 0;
		System.out.println("The game is afoot!");
		boolean gameInProgress = true;
		while (gameInProgress)
		{
			String[] guess = new String[4];
			for (int i = 1; i < 2; i++)
			{
				System.out.println("Make a guess! Remember only Black, Blue, Red, and Yellow are valid guesses.");
				if (count == 19)
				{
					System.out.println("To give up, type give up to end the game and show you the answer.");
				}
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
				StringTokenizer firstSpace = new StringTokenizer(input, ",");
				if (processInput(guess, firstSpace))
				{
					
				}
				else
				{
					i--;
				}
//				if ((!input.equalsIgnoreCase("Black")) && (!input.equalsIgnoreCase("Blue")) 
//						&& (!input.equalsIgnoreCase("Red")) && (!input.equalsIgnoreCase("Yellow")))
//				{
//					System.out.println("No, Laura, follow the instructions given.");
//					laura = true;
//				}
//				guess[i - 1] = input;
			}
			if (gameInProgress == false)
			{
				break;
			}
			check.checkGuess(guess);
			if (check.isWinner())
			{
				System.out.println("You are the Mastermind!");
				gameInProgress = false;
			}
			else
			{
				check.giveResult();
				System.out.println();
				System.out.println("Guess again!");
			}
		}
		
	}
	public static boolean processInput(String [] guess, StringTokenizer firstSpace)
	{
		try
		{
			String first = firstSpace.nextToken();
			String second = firstSpace.nextToken();
			String third = firstSpace.nextToken();
			String fourth = firstSpace.nextToken();
			for (int i = 0; i < 4; i++)
			{
				
				if (i == 0)
				{
					if ((!first.toLowerCase().contains("black")) ||
							(!first.toLowerCase().contains("blue")) 
							|| (!first.toLowerCase().contains("red")) ||
							(!first.toLowerCase().contains("yellow")))
					{
						
					}
					else
					{
						System.out.println("Bad input for first peg.");
						return false;
					}
				}
				if (i == 1)
				{
					if ((!second.toLowerCase().contains("black")) ||
							(!second.toLowerCase().contains("blue")) 
							|| (!second.toLowerCase().contains("red")) ||
							(!second.toLowerCase().contains("yellow")))
					{
						
					}
					else
					{
						System.out.println("Bad input for second peg.");
						return false;
					}
				}
				if (i == 2)
				{
					if ((!third.toLowerCase().contains("black")) ||
							(!third.toLowerCase().contains("blue")) 
							|| (!third.toLowerCase().contains("red")) ||
							(!third.toLowerCase().contains("yellow")))
					{
						
					}
					else
					{
						System.out.println("Bad input for third peg.");
						return false;
					}
				}
				if (i == 3)
				{
					if ((!fourth.toLowerCase().contains("black")) ||
							(!fourth.toLowerCase().contains("blue")) 
							|| (!fourth.toLowerCase().contains("red")) ||
							(!fourth.toLowerCase().contains("yellow")))
					{
						
					}
					else
					{
						System.out.println("Bad input for fourth peg.");
						return false;
					}
				}
			}
			guess[0] = first;
			guess[1] = second;
			guess[2] = third;
			guess[3] = fourth;
			return true;
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Input error! Make sure you have only 4 pegs.");
			return false;
		}
	}
}
