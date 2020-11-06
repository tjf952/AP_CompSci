import java.io.*;
import java.util.*;

public class Schedule
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter output = new PrintWriter("C:\\JavaStuff\\output.txt");
        
        FileReader inputReader = new FileReader("C:\\JavaStuff\\input.txt");
        Scanner inputFile = new Scanner(inputReader);

        String [] teams = new String[10];
        
        //Assigns each team to an array
        int lineCt = 0;
        while(inputFile.hasNextLine())
        {
            teams[lineCt] = inputFile.nextLine();
            lineCt++;
        }
        
        //String testing and team listing
        output.println("Teams competing in league:");
        for(int i = 0; i < teams.length; ++i)
        {
            output.println(teams[i]);
        }
        output.println("\t");
        
        for(int week = 1; week <= teams.length - 1; ++week)
        {
            //Prints current week's schedule
            output.println("Week " + week + ":");
            for(int match = 0; match < teams.length/2; ++match)
            {
                output.println(teams[match] + " vs. " + teams[9 - match]);
            }

            //Algorithm for round-robin swap - one team is stationary, the rest switch
            String temp = teams[9];
            for(int i = teams.length - 1; i > 1; --i)
            {
                teams[i] = teams[i-1];
            }
            teams[1] = temp;
            
            output.println("\t");
        }
        inputFile.close();
        output.close();
    }
}