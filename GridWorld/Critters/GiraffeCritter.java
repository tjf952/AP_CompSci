import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class GiraffeCritter extends Critter{  
    private int hungrySteps = 0;
    public static final int NECK_SIZE = 2;
    public static final int STOMACH_SIZE = 3;
    public static final int MAX_HUNGRY_STEPS = 5;
    // gives the amount of flowers around the giraffe
    @Override
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> flowers = new ArrayList<Actor>();
        for(int row = getLocation().getRow() - NECK_SIZE; row <= getLocation().getRow() + NECK_SIZE; row++){
            for(int col = getLocation().getCol() - NECK_SIZE; col <= getLocation().getCol() + NECK_SIZE; col++){
                Location loc = new Location(row, col);
                if (this.getGrid().isValid(loc) && this.getGrid().get(loc) instanceof Flower){
                    flowers.add(getGrid().get(loc));
                }
            }
        }
        return flowers;
    }
    // defines stomach and increments stomach size and hungry steps
    @Override
    public void processActors(ArrayList<Actor> actors){
        this.setColor(Color.YELLOW);
        int getFlowers = 0;
        for (Actor a : actors){
            if (getFlowers < STOMACH_SIZE){
                a.removeSelfFromGrid();
                getFlowers++;
            }
        }
        if (getFlowers == STOMACH_SIZE){
            hungrySteps = 0;
        } else {
            hungrySteps++;
        }
        System.out.println("HungrySteps: " + hungrySteps + "\n");
    }
    
    public Location selectMoveLocation(ArrayList<Location> locs){
        if (hungrySteps >= MAX_HUNGRY_STEPS){
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
        
        world.add(new Location(4, 5), new GiraffeCritter());
        world.add(new Location(4, 4), new GiraffeCritter());
        world.add(new Location(5, 5), new GiraffeCritter());
        world.add(new Location(5, 4), new GiraffeCritter());
        
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