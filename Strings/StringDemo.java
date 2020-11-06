public class StringDemo
{
    public static void main(String[]args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        int whereIsFirstL = s1.indexOf("l");
        
        //Finds specific char
        System.out.println("Finding Chars");
        System.out.println("The first 'l' is in index " + whereIsFirstL);
        
        //Finds length of string
        System.out.println("\n" + "Length");
        System.out.println("The length of s1 is " + s1.length());
        
        
        //Compares strings
        System.out.println("\n" + "Comparing");
        boolean same1 = (s1 == s2);
        System.out.println("Boolean 1 is " + same1 + " when s1 and s2 are " + s1 + " + " + s2);
        boolean same2 = (s1 == s3);
        System.out.println("Boolean 2 is: " + same2);
        
        //Print Example
        System.out.println("\n" + "Adding Strings");
        s2 = " world!";
        System.out.println(s1 + s2);
        
        //Trimming Example
        System.out.println("\n" + "Trim Function");
        s2 = "       world       ";
        s2 = s2.trim();
        System.out.println(">" + s2 + "<");
        
        //.equals VS ==
        System.out.println("\n" + ".equals VS ==");
        String a1 = "abc";
        String a2 = a1;
        String a3 = a2;
        boolean answerWord = false;
        boolean answerNum = false;
        if (a1.equals(a3)){
            answerWord = true;
        }
        if (a1 == a2){
            answerNum = true;
        }
        System.out.println(a3);
        System.out.println("With .equals, it is " + answerWord);
        System.out.println("With ==, it is " + answerNum);
        
        //Output
        System.out.println("\n" + "Output Example");
        String S = "razzle-dazzle";
        int k = S.indexOf("z");
        while(k != -1){
            S = S.substring(0,k) + "p" + S.substring(k + 1);
            k = S.indexOf("z");
        }
        System.out.println(S);
        
        int x = "Thomas".length();
        System.out.println(x);
    }
}