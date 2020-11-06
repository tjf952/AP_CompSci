
/**
 * Write a description of class DogTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogTester
{
   public static void main(String[]args){
       //first, create 5 dogs (3 huskies and 2 labs)
       Huskie a = new Huskie("Ally");
       Huskie b = new Huskie("Bobby");
       Huskie c = new Huskie("Cassie");
       Lab d = new Lab("Danny");
       Lab e = new Lab("Elliot");
       //create an array of 5 Dog pointers
       SimpleDog[] woof = new SimpleDog[5];
       //load the pointers with the 5 dogs
       woof[0] = a;
       woof[1] = b;
       woof[2] = c;
       woof[3] = d;
       woof[4] = e;
       //using a for loop, write out all 5 names
       for(SimpleDog dog: woof){
           System.out.println(dog);
        }
    }
}
