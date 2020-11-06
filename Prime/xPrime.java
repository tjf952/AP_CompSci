
public class xPrime
{
    public static boolean isPrime(double x){
        boolean answer = true;
        for (int i = 2; i <= Math.sqrt(x); i++){
            if ((x%i) == 0){
                return false;
            }
        }
        return answer;
    }
    public static void main(String[]args){
        // Prints all prime numbers below primeCounter
        int primeCounter = 2;
        int count = 1;
        while (primeCounter <= 50){
            if (isPrime(primeCounter)){
                System.out.println(count + ": " + primeCounter); //Another prime found
                ++count;
            }
            ++primeCounter;
        }
    }
}
