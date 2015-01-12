
public class Peg
{
	private Boolean checked = false;
	private String color;
	
	public Peg(String col)
	{
		color = col;
	}
	
	public Boolean isChecked()
	{
		return checked;
	}
	
	public void changeStatus()
	{
		checked ^= true;
	}
	public String checkColor()
	{
		return color;
	}
}
