import java.util.ArrayList;


public class GuessChecker
{
	private Mastermind master;
	private ArrayList<String> result = new ArrayList<String>();
	private int rcwp = 0;
	private int rcrp = 0;
	
	public GuessChecker(Mastermind a)
	{
		master = a;
	}
	
	public void checkGuess(String[] guess)
	{
		Peg[] answer = master.getAnswer();
		for (int i = 0; i < guess.length; i++)
		{
			for (int j = 0; j < answer.length; j++)
			{
				if (answer[j].isChecked() == true)
				{
					
				}
				else
				{
					if (guess[i].equalsIgnoreCase(answer[i].checkColor()))
					{
						rcrp++;
						answer[j].changeStatus();
						break;
					}
					else if (guess[i].equalsIgnoreCase(answer[j].checkColor()))
					{	
						rcwp++;
						answer[j].changeStatus();
						break;
					}
				}
			}
		}
		for (int i = 0; i < answer.length; i++)
		{
			answer[i].changeStatus();
		}
	}
	
	public void checkGuess2(String[] guess, Peg[] fake)
	{
		for (int i = 0; i < guess.length; i++)
		{
			for (int j = 0; j < fake.length; j++)
			{
				if (fake[j].isChecked() == true)
				{
					
				}
				else
				{
					if (guess[i].equalsIgnoreCase(fake[i].checkColor()))
					{
						rcrp++;
						fake[j].changeStatus();
						break;
					}
					else if (guess[i].equalsIgnoreCase(fake[j].checkColor()))
					{	
						rcwp++;
						fake[j].changeStatus();
						break;
					}
				}
			}
		}
		for (int i = 0; i < fake.length; i++)
		{
			fake[i].changeStatus();
		}
	}
	public boolean isWinner()
	{
		if (rcrp == 4)
		{
			return true;
		}
		return false;
	}
	public void giveResult()
	{
		for (int i = 0; i < rcwp; i++)
		{
			result.add("White");
		}
		for (int i = 0; i < rcrp; i++)
		{
			result.add("Black");
		}
		for (int i = 0; i < result.size(); i++)
		{
			System.out.println(result.get(i));
		}
	}
}
