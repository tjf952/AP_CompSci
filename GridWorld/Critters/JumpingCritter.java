import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class JumpingCritter extends Critter
{
    public JumpingCritter(){
        this.setColor(Color.ORANGE);
    }
    public ArrayList<Location> getMoveLocations(){
        return GridWorldUtilities.getEmptyLocations(getGrid());
    }
    public void makeMove(Location loc){
       if(loc == null){
           this.removeSelfFromGrid();
        }
    }
    public static void main(String[] args)
    {
        //BoundedGrid grid = new BoundedGrid(2,2);
        //ActorWorld world = new ActorWorld(grid);
        ActorWorld world = new ActorWorld();
        //world.add(new Location(1, 0), new Rock(Color.BLUE));
        //world.add(new Location(0, 1), new Rock(Color.BLUE));
        //world.add(new Location(1, 1), new Rock(Color.BLUE));
        world.add(new Location(0, 0), new JumpingCritter());
        world.show();
    }
}