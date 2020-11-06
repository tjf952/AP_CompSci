
/**
 * Write a description of class MilitaryClockRunner here.
 * 
 * @author (C. Sarkar) 
 * @version (V1.0)
 */
public class MilitaryClockRunner
{

    public static void main(String [] args)
    {
        System.out.println("\f"); // clear the console
        
        MilitaryClock d = new MilitaryClock();
        System.out.println("Expected output >>> 00:00");
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
        
        MilitaryClock d2 = new MilitaryClock(11, 59);
        System.out.println("Expected output >>> 11:59");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n"); 
        
        d2.addOneMinute();
        System.out.println("Expected output >>> 12:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");   
        
        d2.addMinutes(60);
        System.out.println("Expected output >>> 13:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n"); 
        
        d2.resetTime(23,59);
        System.out.println("Expected output >>> 23:59");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");
        
        d2.addOneMinute();
        System.out.println("Expected output >>> 00:00");
        System.out.print(  "Actual   output >>> ");
        System.out.println(d2 + "\n");       
    }
}
