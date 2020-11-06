import java.io.*;
import java.util.*;
/**
 * Write a description of class MissingFileDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissingFileDemo
{
    public static void main(String[] args) throws Exception{
        FileReader fileInput = null;
        PrintWriter goodOutput = null;
        PrintWriter badOutput = null;
        try{
           fileInput = new FileReader("employee.txt");
           goodOutput = new PrintWriter("GoodOutput.txt");
           badOutput = new PrintWriter("BadOutput.txt");
           Scanner inputFile = new Scanner(fileInput);
           while(inputFile.hasNextLine()){
               String line = inputFile.nextLine();
               String[] section = line.split(":");
               try{
                   System.out.println("in try block... Testing Line: " + line
                    + "\nSection 1: " + section[0] + "\nSection 2: " + section[1]
                    + "\nSection 3: " + section[2]);
                   if(ValidSSNdemo.validSSN(section[0]) == false){
                       throw new Exception();
                    }
                   if(section[1].equals("")){
                        throw new Exception();
                    }
                   if(section[2].equals("")){
                       throw new Exception();
                    }
                   goodOutput.println(line);
                }
               catch(Exception e){
                   badOutput.println(line);
                   System.out.println("In catch block...\nFound error...\n\t" + e);
                }
            }
           inputFile.close();
        }
        catch(FileNotFoundException ex)
        {
            //handle the FileNotFoundException
            System.out.println("File not found. Exiting program.");
            System.exit(1);
        }
        catch(Exception ex)
        {
            //handle the IOException
            System.out.println("Unkown exception");
            System.exit(2);
        }
        finally{
            fileInput.close();
            goodOutput.close();
            badOutput.close();
        }
    }
}
