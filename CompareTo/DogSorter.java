import java.util.*;

public class DogSorter
{
 public static void main(String [] args)
 {
     Dog [] doggies = { new Dog("Fluffy", 55), 
                         new Dog("Midnight", 72),
                         new Dog("Codey", 24),
                         new Dog("Pokey", 96) };  
     // array version
     Arrays.sort(doggies);
     System.out.println("Array Version:"); // clear the console
     for (int i=0; i<doggies.length; ++i)
        System.out.println("\t" + doggies[i]);    // print out sorted list
      
        
     System.out.println("\n\nArrayList Version:"); 
     // arraylist version
     ArrayList<Dog> morePuppies = new ArrayList<Dog>();
     morePuppies.add(new Dog("Charlie", 54));
     morePuppies.add(new Dog("Mickey", 98));
     morePuppies.add(new Dog("Jackie", 57));
     morePuppies.add(new Dog("Fluffy", 55));
     morePuppies.add(new Dog("Midnight", 72));
     morePuppies.add(new Dog("Codey", 24));
     morePuppies.add(new Dog("Pokey", 96));
     morePuppies.add(new Dog("Biscuit", 18));
     morePuppies.add(new Dog("Cutieputootie", 12));
     morePuppies.add(new Dog("Tank", 109));
     Collections.sort(morePuppies);
     
     for (Dog nextDog : morePuppies)
         System.out.println("\t" + nextDog);    // print sorted list
     
     
     
 }
}
