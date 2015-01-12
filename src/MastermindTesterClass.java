
public class MastermindTesterClass
{

	public static void main(String[] args)
	{
		int color = 1 + (int) (Math.random() * 4);
		System.out.println(color);
		
		Mastermind game = new Mastermind();
		System.out.println(game.getFirst());
		System.out.println(game.getSecond());
		System.out.println(game.getThird());
		System.out.println(game.getForth());

	}

}
