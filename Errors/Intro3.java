
/*
 * Testing Reachable Code
 */
public class Intro3
{
    public static void main(String[] args){
        try{
            System.out.println("Try Block...");
            String test[] = new String[1];
            test[0] = "Thomas";
            test[1] = "Austin";
            test[2] = "Casey";
            System.out.println("Try Block Concluded...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nError Met...\nCatch Block...");
            System.out.println("Out of Bounds Exception Caught: " + e);
        }
        finally{
            System.out.println("\nFinally Block...");
        }
        System.out.println("\nArray Test of type String is created");
    }
}
