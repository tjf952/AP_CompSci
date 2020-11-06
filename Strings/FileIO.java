import java.io.*;
import java.util.*;
/**
 * Split Lab
 */
public class FileIO
{
    public static void main(String[]args)throws FileNotFoundException
    {
        //Declares input and output files
        PrintWriter namesFile = new PrintWriter("C:\\JavaStuff\\names.txt");
        PrintWriter salariesFile = new PrintWriter("C:\\JavaStuff\\salaries.txt");
        PrintWriter SSNFile = new PrintWriter("C:\\JavaStuff\\SSN.txt");
        FileReader reader = new FileReader("C:\\JavaStuff\\input.txt");
        //Scanner used to read from file
        Scanner inputFile = new Scanner(reader);
        while(inputFile.hasNextLine()){ // For each line of input
            String line = inputFile.nextLine(); // Reads next line
            String[] tokens = line.split(";");
            namesFile.println(tokens[0]);
            salariesFile.println(tokens[1]);
            SSNFile.println(tokens[2]);
        }
        inputFile.close();
        namesFile.close();
        salariesFile.close();
        SSNFile.close();
    }
}
