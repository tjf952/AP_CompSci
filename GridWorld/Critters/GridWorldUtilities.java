import java.util.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class GridWorldUtilities
{
    public static ArrayList<Location> getEmptyLocations(Grid<Actor> grid){
        ArrayList<Location> locs = new ArrayList<Location>();
        for(int row = 0; row < grid.getNumRows(); ++row){
            for(int col = 0; col < grid.getNumCols(); ++col){
                Location loc = new Location(row, col);
                if(grid.isValid(loc)){
                    Actor a = grid.get(loc);
                    if(!(a instanceof Actor)){
                        locs.add(loc);
                    } 
                }
            }
        }
        return locs;
    }
}
