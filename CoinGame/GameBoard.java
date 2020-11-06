

public class GameBoard
{
   public String returnCoins(int currentCoins) //method that prints the current game board (imports current coins on the board)
   {
       String coinOutput = ""; //initializes coinOutput variable, which creates the board to be printed (a visual)
       int starCounter = 0; //initializes starCounter variable, which counts how many coins are present in coinOutput
       for(int i = 1; i<= currentCoins; i++) //runs while i<=current coins on the board(in runner class, imported)
       {
           if(starCounter%3 == 0)//if the coins that are going to be printed has reached 3 (a row of 3 coins)
           {
               coinOutput = (coinOutput + "\n*"); //go to a new line and add one coin visual
               starCounter++; //add one coin to the coin counter
           }
           else //if the current row does not contain 3 coins
           {
               coinOutput = (coinOutput + "*"); //add one coin visual
               starCounter++; //add one coin to the coin counter
           }
        }
       return (coinOutput); //return the coinOutput (gameboard visual)
    }
}
