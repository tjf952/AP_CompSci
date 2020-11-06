
public class randomNum
{
    public static int randomNumber(){
        int num = 9 + (int)(4*Math.random());
        return num;
    }
    public static void main(String[]args){
        System.out.println(randomNumber());
        System.out.println(randomNumber());
        System.out.println(randomNumber());
        System.out.println(randomNumber());
        System.out.println(randomNumber());
        System.out.println(randomNumber());
    }
}
