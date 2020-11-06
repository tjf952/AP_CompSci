/*
 * Thomas Finn
 * Coin Game Project
 * October 28, 2013
 */
public class CoinGameRunner
{
    public static void main(String [] args)
    {
        System.out.print("\f"); // clear board for new game
        GameBoard board = new GameBoard(); 
        Computer cpu = new Computer();
        User thomas = new User(); //bring all three classes into runner
        String name = (thomas.whatIsName()); //set user name into String name
        int currentCoins = (thomas.howManyStart(name)); //set the amount of coins that the user wants to play with
        int initialCoins = currentCoins; //create a constant int for initial coins, to know when 0 coins remain (while turns< initialCoins)
        int turn = (thomas.whoGoesFirst()); //ask the user who goes first, initialize the turn variable which keeps track of whose turn it is
        int turnCounter = 0;//initialize the turn counter, which keeps track of how many have been taken in total (for the while statement)
        while(turnCounter<initialCoins) //runs until the number of coins taken has reached the number of coins that started
        {
            if(turn == 1) //human's turn procedure
            {
                System.out.println(board.returnCoins(currentCoins)); //print current board
                int tempCoins = (thomas.howManyCoins(name)); //asks how many coins to take, sets the coins taken into tempCoins
                currentCoins -= tempCoins; //subtracts the coins taken from the total coins remaining
                turnCounter += tempCoins; //adds the coins taken to the total number of coins taken
                turn += 1; //sets turn to 2, making it the computer's turn
            }
            if(turn == 2 && turnCounter < initialCoins) //computer's turn procedure
            {
                System.out.println(board.returnCoins(currentCoins)); //print current board
                int tempCoins = (cpu.computerMove(currentCoins)); //calls the method from the computer to ask how many coins will be taken
                System.out.println("Computer took " + tempCoins); //displays the number of coins the computer will take
                currentCoins -= tempCoins; //subtracts the coins taken from the total coins remaining
                turnCounter+=tempCoins; //adds the coins taken to the total number of coins taken
                turn -=1; //sets turn back to 1, making it the human's turn
            }
       }
       if(turn==1) //after no coins remain and the while loop is completed..
       System.out.println("You win, " + name +"!"); //if the user has won, print that the user won
       else
       System.out.println("Computer wins."); //if the computer has won, print that the computer won
    }
}
