
public class charFinder
{
    public static int charCount(String str){
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[]args){
        String str = "Applachain";
        System.out.println(charCount(str));
    }
}
