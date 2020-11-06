public class Dog implements Comparable<Dog>
{
    private String name;
    int weight;
    
    public Dog()
    {
        this("none", 0);
    }
    
    public Dog(String myName, int myWeight)
    {
        name = myName;
        weight = myWeight;
    }
    
    /* compareTo version for newer compilers */
    public int compareTo(Dog puppy)
    {
         //if this song is less popular than some other song
        if (weight < puppy.weight)
            return -1;
        //if this song is more popular than some other song
        if (weight > puppy.weight)
            return 1;
        // if we get here, popularity is equal
        return 0;
        
    }
    
    @Override
    public String toString()
    {
        return "Name: " + name + "    Weight: " + weight;
    }
}