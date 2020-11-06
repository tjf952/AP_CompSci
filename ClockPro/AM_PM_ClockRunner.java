
/**
 * Tests AM_PM_Clock class.
 * 
 * @author (C. Sarkar) 
 * @version (V1.0)
 */
public class AM_PM_ClockRunner
{

    public static void main(String [] args)
    {
        System.out.println("\f"); // clear the console
        
        AM_PM_Clock d = new AM_PM_Clock();
        System.out.println("Expected output >>> 12:00AM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");
        
        
        d.setHour(7);
        System.out.println("Expected output >>> 07:00AM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");
        
        d.addOneMinute();
        System.out.println("Expected output >>> 07:01AM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");  
        
        d.addMinutes(59);
        System.out.println("Expected output >>> 08:00AM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");     
        
        AM_PM_Clock d2 = new AM_PM_Clock(11, 59, "AM");
        System.out.println("Expected output >>> 11:59AM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n"); 
        
        d2.addOneMinute();
        System.out.println("Expected output >>> 12:00PM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");   
        
        d2.addMinutes(60);
        System.out.println("Expected output >>> 01:00PM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");    
        //Code was written with a mistake 
        //Expected output >>> 1:00AM (that should be PM)
        d2.resetTime(12, 59, "PM");
        d2.addOneMinute();
        System.out.println("Expected output >>> 01:00PM");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");   
    }
}
