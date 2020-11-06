
/**
 * Write a description of class Address here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Address
{
   public static void main(String [] args){
        int[]x = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < x.length; ++i){
            System.out.println(" x[" + i + "] = " + x[i]);
         }
        
        int[]y;
        y = x;
        y[0] = 47;
        System.out.println("The length of y is: " + y.length);
        for(int i = 0; i < y.length; ++i){
           System.out.println(" y[" + i + "] = " + y[i]);
        }
        // Known as a shallow copy of x or a deep copy of x
        
    }
}
