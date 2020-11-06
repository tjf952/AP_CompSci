
/**
 * Write a description of class TestSnowman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class TestSnowman
{
    public static void main (String [] args)
    {
        Snowman snowy = new Snowman();
        Squishy beanie = new Squishy();
        SnowmanWithScarf ornament = new SnowmanWithScarf();
        CaseySnowman casey = new CaseySnowman();
        System.out.println (snowy);
        System.out.println (beanie);        
        System.out.println (ornament);
        System.out.println(casey);
        ornament.setHatColor ("old black");
        System.out.println (ornament);     
        casey.setMood("violent");
        beanie.setHatColor (snowy.getHatColor() );
        System.out.println (beanie);     
        System.out.println(casey);
        ArrayList<Snowman> family = new ArrayList<Snowman> ();
        family.add( snowy );
        family.add( beanie );
        family.add( ornament );
        family.add(casey);
        System.out.println (family);   
    }
}