
/**
 * Split() method tokenizes a string and return an 
 *      Array of string objects
 * Accepts an argument as a delimiter str.split(" ");
 *      String [] tokens = str.split(" ");
 *          (" ") can contain multiple arguments
 *          Use [] to use multiple delimeters
 *          str.split("[@#$]")
 */ 
public class Split
{
    public static void main(String[]args){
        String teachers = "Andrew , Karen , Joseph , Josh";
        String[] tokens = teachers.split(" , ");
        for(int i = 0; i < 4; ++i){
            System.out.println(tokens[i]);
        }
    }
}
