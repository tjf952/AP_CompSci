import java.io.*;
/*
 * Exception is an event, which occurs during the execution of a program
 * Keywords:
 *  Try, Catch, Throw, Throws, Finally* 
 * Learning try{}; catch(Exception e){}; finally{};
 */
public class Intro
{
    public static void main(String[] args){
        FileReader in = null;
        try{
            in = new FileReader("Missing.file");
        }
        catch(FileNotFoundException e){
            // Reports that the file isn't found
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            if(in != null){
                try{
                    in.close();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Finished Parsing");
        }
    }
}
