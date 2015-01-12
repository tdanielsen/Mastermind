
public class Mastermind
{
	private String[] answer = new String[4];
	
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
				answer[i] = "Black";
			}
			if (color == 2)
			{
				answer[i] = "Blue";
			}
			if (color == 3)
			{
				answer[i] = "Yellow";
			}
			if (color == 4)
			{
				answer[i] = "Red";
			}
		}
	}
	
	public String getFirst()
	{
		return answer[0];
	}
	
	public String getSecond()
	{
		return answer[1];
	}
	
	public String getThird()
	{
		return answer[2];
	}
	
	public String getForth()
	{
		return answer[3];
	}

}
