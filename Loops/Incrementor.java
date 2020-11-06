
/**
 * Write a description of class Incrementor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Incrementor
{
   public static int incrementor(int x)
   {
       return ++x;
   }
   public static void main(String[]args){
       int y = 3;
       y = incrementor(y);
       System.out.println(y);
    }
}
