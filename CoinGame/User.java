import java.util.Scanner;
public class User
{
    Scanner keyboard = new Scanner(System.in);//create a scanner to retrieve user input
    public int howManyStart(String name) //method that asks how many coins the user wants to start with (imports name into method)
    {
        System.out.println("How many coins would you like to play with, " + name + "?"); //asks the user how many coins to start with (with user name)
        int answer = keyboard.nextInt(); //initializes answer, imports the number that the user enters into answer
        return answer; //returns the number to the runner class
    }
    public int whoGoesFirst() //method that asks if the user will have the first turn, or if the computer will
    {
        System.out.println("Do you want to go first or second?"); //asks the user who will go first
        boolean valid = false; //procedure to make sure that 1 or 2 is entered starts here, "valid" variable keeps track of if the input is valid
        int answer = 0; //initializes answer
        while(!valid) //runs while a valid answer has not been found
        {
            answer = keyboard.nextInt(); //sets answer to the number that the user enters
            if(answer==1 || answer ==2) //if answer is 1 or 2 (valid answers)
            {
                valid = true; //while loop is terminated
                return answer; //1 or 2 is returned to the runner class
            }
            else //if answer is not 1 or 2
                System.out.println("Enter 1 or 2."); //tell the user to enter 1 or 2, repeat while loop to retrieve a valid answer
    
        }
        return answer;
    }
    public int howManyCoins(String name)//method that asks how many coins the user wants to take on his or her turn, must be 1 or 2 (imports name into method)
    {
        System.out.println("How many coins would you like to take, " + name + "?"); //asks the user how many coins to take (with user name)
        boolean valid = false; //procedure to make sure that 1 or 2 is entered starts here, "valid" variable keeps track of if the input is valid
        int answer = 0; //initializes answer
        while(!valid) //runs while a valid answer has not been found
        {
            answer = keyboard.nextInt(); //sets answer to the number that the user enters
            if(answer==1 || answer ==2) //if answer is 1 or 2 (valid answers)
            {
                valid = true; //while loop is terminated
                return answer; //1 or 2 is returned to the runner class
            }
            else //if answer is not 1 or 2
                System.out.println("Enter 1 or 2."); //tell the user to enter 1 or 2, repeat while loop to retrieve a valid answer
    
        }
        return answer;
    }
    public String whatIsName() //method that asks the user for his or her name
    {
        System.out.println("What is your name?"); //asks the user what is your name
        String answer = keyboard.nextLine(); //initializes answer, sets answer to the next line entered
        return answer; //answer is returned to the runner class
    }
}
