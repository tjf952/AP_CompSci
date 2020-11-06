public class Evens
{
    public static boolean anyEven(int []x){
        for(int i = 0; i < x.length; ++i){
            if(x[i]%2 == 0) return true;
        }
        return false;
    }
}
