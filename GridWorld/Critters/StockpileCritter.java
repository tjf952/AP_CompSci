import java.util.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class StockpileCritter extends Critter
{
    private int stockpile = 3; 
    // changes stockpile
    public void processActors(ArrayList<Actor> actors){
        System.out.println("Stockpile Before: " + stockpile);
        for(Actor a: actors){
            a.removeSelfFromGrid();
            stockpile++;
        }
        stockpile--;
        System.out.println("Stockpile After: " + stockpile);
    }
    
    public Location selectMoveLocation(ArrayList<Location> locs){
        if(stockpile <= 0){
            return null;
        } else {
            return super.selectMoveLocation(locs);
        }
    }
    
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        world.add(new Location(1, 8), new Rock());
        world.add(new Location(1, 1), new Rock());
        
        world.add(new Location(4, 5), new StockpileCritter());
        world.add(new Location(4, 4), new StockpileCritter());
        world.add(new Location(5, 5), new StockpileCritter());
        world.add(new Location(5, 4), new StockpileCritter());
        
        world.add(new Location(8, 8), new Rock());
        world.add(new Location(8, 1), new Rock());
        /*
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
        */
        world.add(new Location(2, 3), new Bug());
        world.add(new Location(2, 4), new Bug());
        world.add(new Location(2, 5), new Bug());
        world.add(new Location(2, 6), new Bug());
        world.add(new Location(7, 3), new Bug());
        world.add(new Location(7, 4), new Bug());
        world.add(new Location(7, 5), new Bug());
        world.add(new Location(7, 6), new Bug());
        world.add(new Location(4, 2), new Bug());
        world.add(new Location(5, 2), new Bug());
        world.add(new Location(4, 7), new Bug());
        world.add(new Location(5, 7), new Bug());
        world.add(new Location(3, 2), new Bug());
        world.add(new Location(6, 2), new Bug());
        world.add(new Location(3, 7), new Bug());
        world.add(new Location(6, 7), new Bug());
        
        world.show();
    }
}
