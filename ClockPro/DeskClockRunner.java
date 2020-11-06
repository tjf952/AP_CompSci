
/**
 * Tests the DeckClock class
 * 
 * @author (C. Sarkar) 
 * @version (V1.0)
 */
public class DeskClockRunner
{
 
    public static void main(String [] args)
    {
        System.out.println("\f"); // clear the console
        
        DeskClock d = new DeskClock();
        System.out.println("Expected output >>> 12:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");
        
        d.setHour(7);
        System.out.println("Expected output >>> 07:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");
        
        d.addOneMinute();
        System.out.println("Expected output >>> 07:01");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");  
        
        d.addMinutes(59);
        System.out.println("Expected output >>> 08:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d + "\n");     
        
        DeskClock d2 = new DeskClock(11, 59);
        System.out.println("Expected output >>> 11:59");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n"); 
        
        d2.addOneMinute();
        System.out.println("Expected output >>> 12:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");   
        
        d2.addMinutes(60);
        System.out.println("Expected output >>> 01:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");    
        
        d2.resetTime(12, 59);
        d2.addOneMinute();
        System.out.println("Expected output >>> 01:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");   
    }
}
