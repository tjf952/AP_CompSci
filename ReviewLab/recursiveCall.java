
public class recursiveCall
{
    public static void recursiveCaller(String str){
        if(str.length() > 1){    
            recursiveCaller(str.substring(0,str.length()-1));
        }
        System.out.println(str);
    }
    public static void main(String[]args){
        recursiveCaller("Catty");
    }
}
