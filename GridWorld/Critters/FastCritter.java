import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class FastCritter extends Critter
{

    @Override
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locations = new ArrayList<Location>();
        Location myLoc = this.getLocation();

        for (int row = myLoc.getRow() - 2; row <= myLoc.getRow() + 2; row += 2)
        {
            for (int col = myLoc.getCol() - 2; col <= myLoc.getCol() + 2; col += 2)
            {
                Location loc = new Location(row, col);
                if (this.getGrid().isValid(loc))
                {
                    if (getGrid().get(loc) == null)
                        locations.add(loc); // add empty neighboring locations
                }
            }
        }

        if (locations.size() == 0) // can we move two spaces?
            return super.getMoveLocations(); // if we cant move two spaces try one
        else
            return locations;   // if here, two-space move is possible
    } 
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(2, 8), new Rock(Color.BLUE));
        world.add(new Location(5, 5), new Rock(Color.PINK));
        world.add(new Location(1, 5), new Rock(Color.RED));
        world.add(new Location(7, 2), new Rock(Color.YELLOW));
        world.add(new Location(4, 4), new FastCritter());
        world.add(new Location(5, 8), new FastCritter());
        world.show();
    }
}
