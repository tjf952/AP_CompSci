public class Parenthesis
{
    public static boolean parenthesisCheck(String str){
        if(str.length()== 0){
            return true;
        }
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
            return parenthesisCheck(str.substring(1, str.length()-1));
        }
        return false;
    }
    public static void main(String[]args){
        System.out.println("TRUE: " + parenthesisCheck("()"));
        System.out.println("FALSE: " + parenthesisCheck("(()"));
        System.out.println("FALSE: " + parenthesisCheck("(()())"));
        System.out.println("TRUE: " + parenthesisCheck("((()))"));
    }
}