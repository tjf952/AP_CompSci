import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class RLScritter extends Critter{  
    private int life = 1; // After 25 days (moves) critter will die (be removed)
    private Color col;
    final int AGE = 25; // Max life
    
    public RLScritter(Color myColor){
        col = myColor;
        this.setColor(col);
    }
    
    @Override
    public ArrayList<Actor> getActors(){
        //return super.getActors();
        ArrayList<Actor> actors = new ArrayList<Actor>(); 
        Location myLoc = this.getLocation();
        Location loc = myLoc.getAdjacentLocation((int)(Math.random()*360));
        // Before used getDirection() but I think that returns only above
        if(this.getGrid().isValid(loc)){
            Actor a = this.getGrid().get(loc);
            if(a != null){
                actors.add(a);
            } 
        }
        return actors; 
    }

    @Override
    public void processActors(ArrayList<Actor> actors){
        for (Actor a : actors){
            if (a instanceof RLScritter){
                RLScritter baby = new RLScritter(col);
                int row = (int)(Math.random() * 10);
                int col = (int)(Math.random() * 10);
                Location loc = new Location(row, col);
                baby.putSelfInGrid(a.getGrid(), loc);
            } else {
                a.removeSelfFromGrid();
            }
        }
        life++;
    }
    
    @Override
    public Location selectMoveLocation(ArrayList<Location> locs){
        if (life > AGE){
            return null;
        } else {
            return super.selectMoveLocation(locs);
        }
    }
    
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        
        world.add(new Location(1, 8), new Rock());
        world.add(new Location(1, 1), new Rock());
        
        world.add(new Location(2, 8), new RLScritter(Color.CYAN));
        world.add(new Location(2, 1), new RLScritter(Color.CYAN));
        world.add(new Location(7, 8), new RLScritter(Color.CYAN));
        world.add(new Location(7, 1), new RLScritter(Color.CYAN));
        
        world.add(new Location(3, 7), new RLScritter(Color.MAGENTA));
        world.add(new Location(3, 2), new RLScritter(Color.MAGENTA));
        world.add(new Location(6, 7), new RLScritter(Color.MAGENTA));
        world.add(new Location(6, 2), new RLScritter(Color.MAGENTA));
        
        world.add(new Location(8, 8), new Rock());
        world.add(new Location(8, 1), new Rock());
        
        world.show();
    }
    public static void sub(String[]args){
        BoundedGrid<Actor> x = new BoundedGrid<Actor>(5,5);
        ActorWorld world = new ActorWorld(x);
        world.add(new Location(0,0), new Rock());
        world.show();
    }
}