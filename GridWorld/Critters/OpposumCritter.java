import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class OpposumCritter extends Critter
{
    private final Color ALIVE = Color.ORANGE;
    private final Color DEAD = Color.BLACK;
    private int deadSteps = 0;
    public OpposumCritter(){
        this.setColor(ALIVE);
    }
    private boolean isFriend(Actor other)
    {
        if (other==null){
            return false;
        }
        // if same color, Opossum no like 
        if (other.getColor() == this.getColor()){
            return true; 
        }
        return false;
    }
    private boolean isFoe(Actor other)
    {
        if (other==null){
            return false;
        }
        if (other.getColor() != this.getColor()){
            return true; 
        }
        return false;
    }
    public void processActors(ArrayList<Actor> actors){
        int friends = 0;
        int foes = 0;
        for (Actor nextActor : actors){ 
            if (isFriend(nextActor)){
                friends++; 
            }
            if (isFoe(nextActor)){
                foes++; 
            }
        } 
        if (foes > friends){ 
            setColor(DEAD); 
            deadSteps++; 
        }
        if(friends > foes){ 
            setColor(ALIVE); 
            deadSteps = 0; 
            super.processActors(actors);
        } 
    }
    public Location selectMoveLocation(ArrayList<Location> locs){
        if (deadSteps == 4){ 
            return null; 
        }
        if (this.getColor() == DEAD){
            return getLocation(); 
        }
        return super.selectMoveLocation(locs); 
    }
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //world.add(new Location(1, 8), new Rock());
        //world.add(new Location(1, 1), new Rock());
        world.add(new Location(4, 5), new OpposumCritter());
        world.add(new Location(4, 4), new OpposumCritter());
        world.add(new Location(5, 5), new OpposumCritter());
        world.add(new Location(5, 4), new OpposumCritter());
        //world.add(new Location(8, 8), new Rock());
        //world.add(new Location(8, 1), new Rock());
        world.add(new Location(2, 3), new ACritter(Color.ORANGE));
        world.add(new Location(2, 4), new ACritter(Color.ORANGE));
        world.add(new Location(2, 5), new ACritter(Color.ORANGE));
        world.add(new Location(2, 6), new ACritter(Color.ORANGE));
        world.add(new Location(7, 3), new ACritter(Color.ORANGE));
        world.add(new Location(7, 4), new ACritter(Color.ORANGE));
        world.add(new Location(7, 5), new ACritter(Color.ORANGE));
        world.add(new Location(7, 6), new ACritter(Color.ORANGE));
        world.add(new Location(4, 2), new ACritter(Color.GREEN));
        world.add(new Location(5, 2), new ACritter(Color.GREEN));
        world.add(new Location(4, 7), new ACritter(Color.GREEN));
        world.add(new Location(5, 7), new ACritter(Color.GREEN));
        world.add(new Location(3, 2), new ACritter(Color.GREEN));
        world.add(new Location(6, 2), new ACritter(Color.GREEN));
        world.add(new Location(3, 7), new ACritter(Color.GREEN));
        world.add(new Location(6, 7), new ACritter(Color.GREEN));
        world.show();
    }
}
