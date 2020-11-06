import java.util.Scanner;
public class primeCalc extends xPrime
{
    // 10,001
    public static double prime(int goal){
        double n = 2;
        int counter = 0;
        while(counter < goal){
            if(isPrime(n)){
                counter++;
            }
            n++;
        }
        return n-1;
    }

    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome user, enter a 1 to begin");
        int answer = kb.nextInt();
        while(answer != -1){                     
            System.out.println("Enter a number \"n\" to calculate nth prime");
            answer = kb.nextInt();
            System.out.println("The " + answer + "th prime is: " + prime(answer));
            continue;
        }
        System.out.println("Quitting");
        kb.close();
    }
}