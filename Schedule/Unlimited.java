import java.io.*;
import java.util.*;
/**
 * Thomas Finn
 * Soccer Lab
 * Unlimited team count
 */
public class Unlimited{
    public static void main(String[]args)throws FileNotFoundException
    {
        //Creates output file in computer
        PrintWriter output = new PrintWriter("C:\\JavaStuff\\output.txt");
        //Reads input file
        FileReader reader = new FileReader("C:\\JavaStuff\\input.txt");
        //Recors input file
        Scanner input = new Scanner(reader);
        
        //Counts number of teams
        int teamAmount = 0;
        while(input.hasNextLine()){
            input.nextLine();
            teamAmount++;
        }
        
        //Creates new file and closes previous information
        input.close();
        FileReader readerNew = new FileReader("C:\\JavaStuff\\input.txt");
        Scanner inputNew = new Scanner(readerNew);
        
        //Creates new string array of objects
        int a = 0;
        if(teamAmount % 2 == 0){
            a = teamAmount;
        }else if(teamAmount % 2 == 1){
            a = teamAmount + 1;
        }
        String [] teams = new String[a];
        
        //Assigns string values to each array value
        int x = 0;//Counter for array
        while(inputNew.hasNextLine()){ 
            teams[x] = inputNew.nextLine();
            ++x;
        }
        
        //Adds the placeholder BYE
        if(teamAmount % 2 == 1){
            teams[teams.length-1] = "BYE";
        }
        
        //States amount of teams
        System.out.println("There are " + teams.length + " teams.\n");
        
        //Make a for loop for weeks 
        for(int week = 1; week < teams.length; ++week){
            System.out.println("Week " + week);//States which week
            //Makes a loop for teams
            for(int team = 0; team < teams.length/2; ++team){
                System.out.print("\tMatch " + (team +1) + ": " );
                System.out.println(teams[team] + " vs. " + teams[(teams.length-1) - team]);
            }
            System.out.println("\n");
            //Make a loop for changing it
            //Change each value of the array
                //Reprint it within the week loop
            String next = teams[teams.length-1];
            for(int i = teams.length-1; i > 1; --i){
                teams[i] = teams[i-1];
            }
            teams[1] = next;
        }
        inputNew.close();
        output.close();
        input.close();
    }
}