import java.io.*;
import java.util.*;
/**
 * Thomas Finn
 * Soccer Lab
 * Prints output file in computer C: file
 */
public class ScheduleIO
{
    public static void main(String[]args)throws FileNotFoundException
    {
        //Creates output file in computer
        PrintWriter output = new PrintWriter("C:\\JavaStuff\\output.txt");
        //Reads input file
        FileReader reader = new FileReader("C:\\JavaStuff\\input.txt");
        //Recors input file
        Scanner input = new Scanner(reader);
        //Creates new string array of objects
        String [] teams = new String [10];
        int x = 0;//Counter for array
        
        //Assigns string values to each array value
        while(input.hasNextLine()){ 
            teams[x] = input.nextLine();
            ++x;
        }
        
        //States amount of teams
        output.println("There are " + teams.length + " teams.\n");
        
        //Make a for loop for weeks 
        for(int week = 1; week < teams.length; ++week){
            output.println("Week " + week);//States which week
            //Makes a loop for teams
            for(int team = 0; team < teams.length/2; ++team){
                output.print("\tMatch " + (team +1) + ": " );
                output.println(teams[team] + " vs. " + teams[9-team]);
            }
            output.println("\n");
            //Make a loop for changing it
            //Change each value of the array
                //Reprint it within the week loop
            String next = teams[teams.length-1];
            for(int i = teams.length-1; i > 1; --i){
                teams[i] = teams[i-1];
            }
            teams[1] = next;
        }
        output.close();
        input.close();
    }
}