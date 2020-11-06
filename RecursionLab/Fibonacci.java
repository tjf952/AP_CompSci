public class Fibonacci
{
    public static int fibonacci(int x)
    {
        if(x <= 1){
            return x;
        }
        return fibonacci(x-1) + fibonacci(x-2);
    }
    public static void main(String[]args)
    {
        for(int i = 0; i < 30; i++){
            System.out.println(fibonacci(i));
        }
    }
}
