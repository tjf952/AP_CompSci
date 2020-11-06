import java.util.*;

public class SongSorter
{
 public static void main(String [] args)
 {
     Song [] mySongs = { new Song("Born to Run", "Springsteen", 500000), 
                         new Song("Walk this Way", "Aerosmith", 340000),
                         new Song(),
                         new Song("Poker Face", "Lady GaGa", 780000) };
        
     // array version
     Arrays.sort(mySongs);
     
     System.out.println("\f  Array Version:"); // clear the console
     for (int i=0; i<mySongs.length; ++i)
        System.out.println(mySongs[i]);    // print out sorted list
      
     System.out.println("\n\n  ArrayList Version:"); 
     // arraylist version
     ArrayList<Song> myOtherSongs = new ArrayList<Song>();
     Song temp = new Song("Royals", "Lorde", 100000);
     myOtherSongs.add(temp);
     temp = new Song("Welcome to the Jungle", "Guns N' Roses", 99000);
     myOtherSongs.add(temp);
     temp = new Song("Wreck of the Edmund Fitzgerald", "Gordon Lightoot", 125000);
     myOtherSongs.add(temp);
     Collections.sort(myOtherSongs);
     
     for (Song nextSong : myOtherSongs)
         System.out.println(nextSong);    // print sorted list
     
     
     
 }
}
