
/*
 * Comparing Throw to Throws;
 */
public class Intro4
{
    public static void main(String[] args){
        try{
            callingMethod();
        }
        catch(ClassNotFoundException e){
            System.out.println("Caught Exception:\n\t" + e);
            e.printStackTrace();
            //Prints Address
        }
        System.out.println("\nFinish Parsing");
    }
    public static void callingMethod() throws ClassNotFoundException
    {
        System.out.println("Calling Method...");
        throw new ClassNotFoundException();
    }
}
