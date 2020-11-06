public class DigitStripper
{
    public static int digit(int n) {
        if(n == 0){
            return n;
        }
        System.out.println(n%10);
        return digit(n/10);
    }
    public static void main(String[]args){
        System.out.println(digit(30987));
    }
}