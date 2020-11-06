public class Counting
{
    public static int counterA(String str){
        if(str.length() == 0){
            return 0;
        }
        if(str.charAt(0) == 'a'){
            return 1 + counterA(str.substring(1));
        }
        return counterA(str.substring(1));
    }
    public static void main(String[]args){
        System.out.println(counterA("alabama"));
    }
}