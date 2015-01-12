
public class GuessChecker
{
	private Mastermind master;
	private String[] result = new String[4];
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
					break;
				}
				if (guess[i].equalsIgnoreCase(answer[j].checkColor()))
				{
					if (i == j)
					{
						rcrp++;
						answer[j].changeStatus();
						break;
					}
					rcwp++;
					answer[j].changeStatus();
					break;
				}
			}
		}
		for (int i = 0; i < answer.length; i++)
		{
			answer[i].changeStatus();
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
			result[i] = "White";
		}
		for (int i = rcwp; i < rcrp; i++)
		{
			result[i] = "Black";
		}
		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}
