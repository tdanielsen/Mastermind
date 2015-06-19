
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
				Peg newPeg = new Peg("black");
				answer[i] = newPeg;
			}
			if (color == 2)
			{
				Peg newPeg = new Peg("blue");
				answer[i] = newPeg;
			}
			if (color == 3)
			{
				Peg newPeg = new Peg("red");
				answer[i] = newPeg;
			}
			if (color == 4)
			{
				Peg newPeg = new Peg("yellow");
				answer[i] = newPeg;
			}
		}
	}
	
	public Peg[] getAnswer()
	{
		return answer;
	}

}
