public class Parser
{
    public static void parser(String str) {
         if(str.length() == 0){
             return;
         }
         System.out.println(str.charAt(0));
         parser(str.substring(1));
         System.out.println(str.charAt(0));
    }
    public static void main(String[]args){
        parser("abcde");
    }
}