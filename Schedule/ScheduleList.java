import java.io.*;
import java.util.*;
/**
 * Thomas Finn
 * Soccer Lab
 * ArrayList
 */
public class ScheduleList{
    public static void main(String[]args)throws FileNotFoundException
    {
        
        //Creates output file in computer
        PrintWriter output = new PrintWriter(".\\JavaStuff\\output.txt");
        //Reads input file
        FileReader reader = new FileReader(".\\JavaStuff\\input.txt");
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
        FileReader readerNew = new FileReader(".\\JavaStuff\\input.txt");
        Scanner inputNew = new Scanner(readerNew);
        
        ArrayList<String> list = new ArrayList<String>();
        while(inputNew.hasNextLine()){ 
            list.add(inputNew.nextLine());
        }
        
        //Adds the placeholder BYE
        if(teamAmount % 2 == 1){
            list.add("BYE");
        }
        
        //States amount of teams
        System.out.println("There are " + list.size() + " teams.\n");
        
        //Make a for loop for weeks 
        for(int week = 1; week < list.size(); ++week){
            System.out.println("Week " + week);//States which week
            //Makes a loop for teams
            for(int team = 0; team < list.size()/2; ++team){
                System.out.print("\tMatch " + (team +1) + ": " );
                System.out.println(list.get(team) + " vs. " + list.get((list.size()-1) - team));
            }
            System.out.println("\n");
            //Make a loop for changing it
            //Change each value of the array
                //Reprint it within the week loop
            String next = list.get(list.size()-1);
            for(int i = list.size()-1; i > 1; --i){
                list.set(i, list.get(i-1));
            }
            list.set(1, next);
        }
        inputNew.close();
        output.close();
        input.close();
    }
}