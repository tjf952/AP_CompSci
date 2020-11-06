import java.util.Random;
public class Computer
{
   Random generator = new Random();//creates a random generator
   public int computerMove(int currentCoins)//method that asks the computerhow many coins it will take (imports currentCoins from runner)
   {
       int coins = currentCoins%3; //initializes a variable that takes modulo 3 of current coins, to create three possible choices
       if(coins == 2) //if remainder of currentCoins is 2, take 1 coin (computer is winning)
       return 1; //return that the computer will take 1
       if(coins == 0) //if remainder of currentCoins is 0, take 2 coins (computer is winning)
       return 2; //return that the computer will take 2
       if(currentCoins == 1) //if there is only one coin remaining (last coin)
       return 1; //take last coin only (not two coins) (computer loses)
       else //if remainder is not 2 or 0 (computer is losing)
       return generator.nextInt(2) + 1; //return 1 or 2 randomly
    }
}
