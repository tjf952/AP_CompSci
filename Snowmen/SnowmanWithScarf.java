
/**
 * Write a description of class Scarf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowmanWithScarf extends Snowman implements Comparable<Object>
{
    private String accessory;
    private String scarfColor;
    
    public SnowmanWithScarf()
    {
        super(2,"black");
        accessory = "broom";
        scarfColor ="red plaid";
    }

    public int compareTo(Object obj)
    {
        // should compare the number of lumps
        if(this.getNumberOfLumps() > ((Snowman)obj).getNumberOfLumps()){
            return 1;
        }
        if(this.getNumberOfLumps() < ((Snowman)obj).getNumberOfLumps()){
            return -1;
        }
        return 0;
    }
    
    public String toString()
    {
        return "SnowmanWithScarf:\n\tHat Color: " + getHatColor() + 
            "\n\tNumber of Lumps: " + getNumberOfLumps() +
            "\n\tAccessory: " + accessory +
            "\n\tScarf Color: " + scarfColor + "\n";
    }
}
