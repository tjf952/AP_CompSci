public class PalindromeX
{
    public static boolean palindrome(String str){
        str = str.replaceAll("[-+'.^:,!?]","");
        str = str.toLowerCase();
        str = str.replaceAll(" ","");// This deletes all spaces.
        // Trim function only takes some of the spaces.
        boolean answer = true;
        int length = (str.length()-1);
        for(int i = 0; i <= length; ++i){
             if(!(str.substring(i,i+1).equals(str.substring(length-i,length+1-i)))){
                // substring(i, i + 1) represents increasing char
                // substring(counter - i) represents last char and then decreasing
                   // (counter - i) is neccessary for it to lower
                // If true, it continues to go through the loop
                answer = false;
             }
        }
        return answer;
    }
    public static void main(String[]args){
        System.out.println("(1-4) is true and (5-7) is false" + "\n");
        System.out.println("1. Bob is " + palindrome("Bob") + "\n"); //True     
        System.out.println("2. Madam... is " + palindrome("Madam I'm Adam") + "\n"); //True
        System.out.println("3. A man... is " +
                          palindrome("A man, a plan, a canal," +
                          "Panama!") + "\n"); //True
        System.out.println("4. Doc... is " + palindrome("Doc," + 
                           "note, I dissent. A fast never prevents a" + 
                           "fatness. I diet on cod.") + "\n"); //True
        System.out.println("5. aa bb... is " + palindrome("aa bb cc aaa") + "\n"); //False    
        System.out.println("6. BbidbB is " + palindrome("BbidbB") + "\n"); //False
        System.out.println("7. Jones is " + palindrome("Jones") + "\n"); //False
    }
}