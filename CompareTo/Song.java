public class Song implements Comparable<Object>
{
    String name;
    String artist;
    int iTunesCopiesSold;
    
    public Song()
    {
        // name = "none";
        // artist = "none";
        // iTunesCopiesSold = 0;
        this("none", "none", 0);  // default values until defined
    }
    
    public Song(String songName, String artistName, int copiesSold)
    {
        name = songName;
        artist = artistName;
        iTunesCopiesSold = copiesSold;
    }
    
    /* version for older compilers (like the one in the computer lab 507 */
    @Override
    public int compareTo(Object someOtherSong)
    {
        //if this song is less popular than some other song
        if (iTunesCopiesSold < ((Song)someOtherSong).iTunesCopiesSold)
            return -1;
        //if this song is more popular than some other song
        if (iTunesCopiesSold > ((Song)someOtherSong).iTunesCopiesSold)
            return 1;
        // if we get here, popularity is equal
        return 0;
    }
    
    /* compareTo version for newer compilers */
    public int compareTo(Song someOtherSong)
    {
         //if this song is less popular than some other song
        if (iTunesCopiesSold < someOtherSong.iTunesCopiesSold)
            return -1;
        //if this song is more popular than some other song
        if (iTunesCopiesSold > someOtherSong.iTunesCopiesSold)
            return 1;
        // if we get here, popularity is equal
        return 0;
        
    }
    
    public String toString()
    {
        return name + " " + artist + " " + "sold: " + iTunesCopiesSold;
    }
}
