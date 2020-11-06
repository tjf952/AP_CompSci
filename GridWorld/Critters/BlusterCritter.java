import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class BlusterCritter extends Critter
{
    private int courage; 
    private int neighbors;
    // constructor: c is a courage variable
    public BlusterCritter(int c){
        courage = c;
        this.setColor(Color.CYAN);
    }
    // main method
    @Override
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
        Location myLoc = this.getLocation();
        for(int row = myLoc.getRow() - 2; row < myLoc.getRow() + 3; ++row){
            for(int col = myLoc.getCol() - 2; col < myLoc.getCol() + 3; ++col){
                Location loc = new Location(row, col);
                if(this.getGrid().isValid(loc)){
                    Actor a = this.getGrid().get(loc);
                    if(a != null && a instanceof Critter){
                        actors.add(a);
                    } 
                }
            }
        }
        actors.remove(this);// do not count myself as a neighboring critter
        neighbors = actors.size();
        return super.getActors();
    }
    // method changes color
    @Override
    public void processActors(ArrayList<Actor> actors){
        if(neighbors < courage){ // get brave?
            this.setColor(this.getColor().brighter()); 
        } else {
            if(neighbors > courage){
                this.setColor(this.getColor().darker());
            }
        }
        super.processActors(actors);
    }
    
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        world.add(new Location(1, 8), new Rock());
        world.add(new Location(1, 1), new Rock());
        
        world.add(new Location(4, 5), new BlusterCritter(1));
        world.add(new Location(4, 4), new BlusterCritter(1));
        world.add(new Location(5, 5), new BlusterCritter(1));
        world.add(new Location(5, 4), new BlusterCritter(1));
        
        world.add(new Location(8, 8), new Rock());
        world.add(new Location(8, 1), new Rock());
        
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