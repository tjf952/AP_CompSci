import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class CornerCritter extends Critter
{
    public CornerCritter(){
        this.setColor(Color.CYAN);
    }
    public ArrayList<Location> getMoveLocations(){
        Grid<Actor> gr = this.getGrid();
        ArrayList<Location> locs = new ArrayList<Location>();
        Location myLoc = this.getLocation();
        if(myLoc.getRow() == 0 && myLoc.getCol() != (gr.getNumCols()-1)){
            locs.add(new Location(0, myLoc.getCol()+1));
        } else if(myLoc.getRow() != (gr.getNumRows()-1) && myLoc.getCol() == (gr.getNumCols()-1)){
            locs.add(new Location(myLoc.getRow()+1, myLoc.getCol()));
        } else if(myLoc.getRow() == (gr.getNumRows()-1) && myLoc.getCol() != 0){
            locs.add(new Location(myLoc.getRow(), myLoc.getCol()-1));
        } else if(myLoc.getCol() == 0 && myLoc.getRow() != 0){
            locs.add(new Location(myLoc.getRow()-1, 0));
        } else{
            locs.add(new Location(myLoc.getRow()-1, myLoc.getCol()-1));
        }
        return locs;
    }
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(1, 1), new Rock(Color.BLUE));
        world.add(new Location(8, 8), new Rock(Color.GREEN));
        world.add(new Location(1, 8), new Rock(Color.MAGENTA));
        world.add(new Location(8, 1), new Rock(Color.CYAN));
        world.add(new Location(0, 0), new CornerCritter());
        world.show();
    }
}
