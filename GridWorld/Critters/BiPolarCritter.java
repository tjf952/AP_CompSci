import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class BiPolarCritter extends Critter
{
    @Override
    public void processActors(ArrayList<Actor> actors)
    {
        if(getColor().equals(Color.BLUE)){
            setColor(Color.RED);
        } else {
            if(getColor().equals(Color.RED)){
                setColor(Color.BLUE);
            }
        }
        super.processActors(actors);
        
    }
    
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        world.add(new Location(2, 8), new Rock());
        world.add(new Location(2, 1), new Rock());
        
        world.add(new Location(4, 5), new BiPolarCritter());
        world.add(new Location(4, 4), new BiPolarCritter());
        world.add(new Location(5, 5), new BiPolarCritter());
        world.add(new Location(5, 4), new BiPolarCritter());
        
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(7, 1), new Rock());
        
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(3, 4), new Rock());
        world.add(new Location(3, 5), new Rock());
        world.add(new Location(3, 6), new Rock());
        world.add(new Location(6, 3), new Rock());
        world.add(new Location(6, 4), new Rock());
        world.add(new Location(6, 5), new Rock());
        world.add(new Location(6, 6), new Rock());
        world.add(new Location(4, 3), new Rock());
        world.add(new Location(5, 3), new Rock());
        world.add(new Location(4, 6), new Rock());
        world.add(new Location(5, 6), new Rock());
        
        world.show();
    }
}
