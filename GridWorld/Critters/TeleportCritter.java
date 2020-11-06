import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class TeleportCritter extends Critter
{
    public TeleportCritter(){
        this.setColor(Color.MAGENTA);
    }
    public ArrayList<Location> getMoveLocations(){
        Grid<Actor> gr = this.getGrid();
        ArrayList<Location> locs = new ArrayList<Location>();
        Location myLoc = this.getLocation();
        if(myLoc.getRow() == 0 && myLoc.getCol() == 0){
            locs.add(new Location(0, gr.getNumCols()-1));
        } else if(myLoc.getRow() == 0 && myLoc.getCol() == (gr.getNumCols()-1)){
            locs.add(new Location(gr.getNumRows()-1, gr.getNumCols()-1));
        } else if(myLoc.getRow() == (gr.getNumRows()-1) && myLoc.getCol() == gr.getNumCols()-1){
            locs.add(new Location(gr.getNumRows()-1, 0));
        } else{
            locs.add(new Location(0, 0));
        }
        return locs;
    }
    public static void main(String[] args)
    {
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(5,5);
        ActorWorld world = new ActorWorld(grid);
        world.add(new Location(1, 1), new Rock(Color.BLUE));
        world.add(new Location(3, 3), new Rock(Color.GREEN));
        world.add(new Location(1, 3), new Rock(Color.MAGENTA));
        world.add(new Location(3, 1), new Rock(Color.CYAN));
        world.add(new Location(0, 0), new TeleportCritter());
        world.show();
    }
}
