import java.io.*;
import java.util.*;

public class ScheduleUnlimitedIO
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter output = new PrintWriter("C:\\JavaStuff\\output.txt");
        
        FileReader inputReader = new FileReader("C:\\JavaStuff\\input.txt");
        Scanner lineCount = new Scanner(inputReader);
        
        //Counts the amount of teams
        int lineAmount = 0;
        while(lineCount.hasNextLine())
        {
            lineCount.nextLine();
            lineAmount++;
        }
        
        //Refreshes file
        lineCount.close();
        FileReader inputReaderRE = new FileReader("C:\\JavaStuff\\input.txt");
        Scanner inputFile = new Scanner(inputReaderRE);

        //Creates string with amount of lines. If odd, add a 'bye' team.
        int amt = 0;
        if(lineAmount % 2 == 1)
        {
            amt = lineAmount + 1;
        }
        else 
            amt = lineAmount;
        String [] teams = new String[amt];
        
        //Assigns each team to an array
        int lineCt = 0;
        while(inputFile.hasNextLine())
        {
            teams[lineCt] = inputFile.nextLine();
            lineCt++;
        }
        if(lineAmount % 2 == 1)
        {
            teams[teams.length-1] = "(BYE PLACEHOLDER)";
        }
        
        //String testing and team listing
        output.println("Teams competing in league:");
        for(int i = 0; i < teams.length; ++i)
        {
            output.println(teams[i]);
        }
        output.println("");
        
        for(int week = 1; week <= teams.length - 1; ++week)
        {
            //Prints current week's schedule
            output.println("Week " + week + ":");
            for(int match = 0; match < teams.length/2; ++match)
            {
                output.println(teams[match] + " vs. " + teams[(teams.length-1) - match]);
            }

            //Algorithm for round-robin swap - one team is stationary, the rest switch
            String temp = teams[teams.length-1];
            for(int i = teams.length - 1; i > 1; --i)
            {
                teams[i] = teams[i-1];
            }
            teams[1] = temp;
            
            output.println("");
        }
        inputFile.close();
        output.close();
    }
}