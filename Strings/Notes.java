
/** STRINGS
 * Strings are immutable!
 * Project String Pro
 * Class --> String Demo
 *    Addition in strings is cancationation
 *      String s1 = "Hello";
 *        s1 = s1 + " world!";
 *        SOP(s1);
 *      String s1 = "Hello";
 *      String s2 = new String("Hello");
 *    Can't compare strings with (s1 == s2), need to compare with contents such as
 *    (s1.equals(s2))
 */
public class Notes
{
    public static void main(String[]args){
        String s1 = "Hello";
        s1 = s1 + " world!";
        System.out.println(s1); // Prints "Hello world"
        String s2 = "Hello world!";
        System.out.println(s2);
    }
}
