
public class Mastermind
{
	private Peg[] answer = new Peg[4];
	
	public Mastermind()
	{
		setGame();
	}
	
	public void setGame()
	{
		for (int i = 0; i < 4; i++)
		{
			int color = 1 + (int) (Math.random() * 4);
			if (color == 1)
			{
				Peg newPeg = new Peg("Black");
				answer[i] = newPeg;
			}
			if (color == 2)
			{
				Peg newPeg = new Peg("Blue");
				answer[i] = newPeg;
			}
			if (color == 3)
			{
				Peg newPeg = new Peg("Red");
				answer[i] = newPeg;
			}
			if (color == 4)
			{
				Peg newPeg = new Peg("Yellow");
				answer[i] = newPeg;
			}
		}
	}
	
	public Peg[] getAnswer()
	{
		return answer;
	}

}
