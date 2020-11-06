
/**
 * Write a description of class CaseySnowman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaseySnowman extends Snowman
{
    private String mood;
	
	public CaseySnowman()
	{
		super(3, "cyan");
		mood= "happy";
	}

	public String getMood()
	{
		return mood;
	}
	public void setMood(String mood){
	    this.mood = mood;
	   }
	
	public String toString()
	{
		return "CaseySnowman:\n\tHat Color: " + getHatColor() + 
            "\n\tNumber of Lumps: " + getNumberOfLumps() +
            "\n\tMood: " + mood + "\n";
	}
}
