import java.io.*;
import java.util.*;

public class ScheduleUnlimitedList
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
        System.out.println("Team amount: " + amt);
        ArrayList<String> teams = new ArrayList<String>();
        
        //Assigns each team to an array
        int lineCt = 0;
        while(inputFile.hasNextLine())
        {
            teams.add(inputFile.nextLine());
            lineCt++;
        }
        if(lineAmount % 2 == 1)
        {
            teams.add("(PLACEHOLDER)");
        }
        System.out.println("Line count: " + lineCt);
        
        //String testing and team listing
        System.out.println("Teams competing in league:");
        for(int i = 0; i < teams.size(); ++i)
        {
            System.out.println(teams.get(i));
        }
        System.out.println("");
        
        for(int week = 1; week <= teams.size() - 1; ++week)
        {
            //Prints current week's schedule
            System.out.println("Week " + week + ":");
            for(int match = 0; match < teams.size()/2; ++match)
            {
                System.out.println(teams.get(match) + " vs. " + teams.get((teams.size()-1) - match));
            }

            //Algorithm for round-robin swap - one team is stationary, the rest switch
            String temp = teams.get(teams.size()-1);
            for(int i = teams.size() - 1; i > 1; --i)
            {
                teams.set(i, teams.get(i-1));
            }
            teams.set(1, temp);
            
            System.out.println("");
        }
        inputFile.close();
        output.close();
    }
}