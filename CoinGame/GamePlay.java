import java.util.*;
public class GamePlay
{
    int coins;
    String userName;
    int turn = 0;
    Scanner keyboard = new Scanner(System.in);
    public GamePlay(){
        askName();
        this.coins = startingCoins();
        this.turn = whoGoesFirst();
        formatBoard();
    }
    public void askName(){
        System.out.println("You have entered my chamber of secrets." 
            + "\nState your name.\n");
        userName = keyboard.nextLine();
    }
    public int startingCoins(){
        System.out.println("\nHello " + userName + ", my name is Tom Marvelo Riddle."
            + "\nWe are going to play a game called the Coin Game."
            + "\nThe point is to take one or two coins until there are none left."
            + "\nThe Loser is the person who takes the last coin."
            + "\nSo how many coins would you dare play with?\n");
        int answer = keyboard.nextInt();
        System.out.println("\nBrilliant...No matter, prepare to suffer defeat!\n");
        return answer;
    }    
    public int whoGoesFirst(){
        System.out.println("Would you fancy going first or second?\n");
        boolean valid = false;
        while(!valid){
            String answer = keyboard.nextLine();
            if(answer instanceof String){
                answer.toLowerCase();
                if(answer.equals("first")){
                    valid = true;
                    return 1;
                } else if(answer.equals("second")){
                    valid = true;
                    return 2;
                }
            } else if (answer.equals("1") || answer.equals("2")){
                valid = true;
                if(answer.equals("1")){
                    return 1;
                } else if(answer.equals("2")){
                    return 2;
                }
            } else{
                System.out.println("I do not understand your response?");
            }
        }
        return 0;
    }
    public void formatBoard(){
        int coinsRemaining = coins;
        int rowCounter = 0;
        System.out.println("\nThese are the coins remaining:");
        for(int i = 1; i <= coinsRemaining; i++){
            if(rowCounter%3 == 0){
                System.out.print("\n*");
                rowCounter++;
            } else {
                System.out.print("*");
                rowCounter++;
            }
        }
    }
    public static void main(String[]args){
        new GamePlay();
    }
}