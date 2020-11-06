
/**
 * Write a description of class Snowman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowman
{
    private String hatColor;
    private int numberOfLumps;

    public Snowman (){  
        this(1, "black");
    }

    public Snowman(int lumps, String hat){
        numberOfLumps = lumps;
        hatColor = hat;
    }

    public int getNumberOfLumps()
    {
        return numberOfLumps;
    }

    public String getHatColor()
    {
        return hatColor;
    }
    
    public void setHatColor( String newHat)
    {
        hatColor = newHat;
    }
    
    public String toString()
    {
        return "Snowman:\n\tHat Color: " + hatColor + 
            "\n\tNumber of Lumps: " + numberOfLumps +"\n";
    }
}
