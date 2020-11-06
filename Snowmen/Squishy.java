
/**
 * Write a description of class Squishy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squishy extends Snowman
{
	private String stuffing;
	
	public Squishy()
	{
		super(2, "red");
		stuffing = "beans";
	}

	public int getLumps()
	{
		return super.getNumberOfLumps();
	}
	
	public String toString()
	{
		return "SquishySnowman:\n\tHat Color: " + getHatColor() + 
            "\n\tNumber of Lumps: " + getLumps() +
            "\n\tStuffing: " + stuffing + "\n";
	}
}
