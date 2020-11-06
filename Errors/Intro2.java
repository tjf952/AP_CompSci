
/*
 * Learning Throw;
 */
public class Intro2
{
    public static void main(String[] args){
        String input = "Testing Throw Keyword";
        try{
            if(input.equals("Testing Throws Keyword")){
                System.out.println("Input Matches...");
            } else {
                throw new RuntimeException("Throwing Runtime Exception");
            }
        }
        catch(RuntimeException e){
            System.out.println("Catching RuntimeException:\n\t" + e);
        }
        System.out.println("\nFinish Parsing");
    }
}
