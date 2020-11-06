import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class EaterCritter extends Critter
{
    private Color col;
    int move = 1;
    int hungrySteps = 0;
    public EaterCritter(Color myCol){
        col = myCol;
        this.setColor(col);
    }
    public ArrayList<Actor> getActors(){
        System.out.println("Move " + move + ":");
        getRedLocation();
        move++;
        return super.getActors();
    }
    public void processActors(ArrayList<Actor> actors){
        int redBugs = 0;
        for (Actor a : actors){ 
            if (!(a instanceof Rock) && !(a instanceof Critter)){
                if(a.getColor() == Color.RED){
                    redBugs++;
                }
                a.removeSelfFromGrid(); 
            }
        } 
        if(redBugs == 0){
            hungrySteps++;
        } else{
            hungrySteps = 0;
        }
        System.out.println("\tHungry Steps: " + hungrySteps);
    }
    public void getRedLocation() {
        Location myLoc = this.getLocation();
        for(int row = myLoc.getRow() - 3; row < myLoc.getRow() + 4; ++row){
            for(int col = myLoc.getCol() - 2; col < myLoc.getCol() + 3; ++col){
                Location loc = new Location(row, col);
                if(getGrid().isValid(loc) && getGrid().get(loc) instanceof Bug){
                    if(getGrid().get(loc).getColor() == Color.RED){ 
                        System.out.println("\tRed Bug At Location " + loc);
                    }
                }
            }
        }
    }
    public void makeMove(Location loc){
        if(hungrySteps == 10){
            loc = null;
        }
        super.makeMove(loc);
    }
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        world.add(new Location(0, 0), new Rock(Color.GREEN));
        world.add(new Location(9, 0), new Rock(Color.BLUE));
        world.add(new Location(9, 9), new Rock(Color.MAGENTA));
        world.add(new Location(0, 9), new Rock(Color.CYAN));

        world.add(new Location(3, 2), new Bug(Color.RED));
        world.add(new Location(3, 4), new Bug(Color.RED));
        world.add(new Location(4, 6), new Bug(Color.RED));
        world.add(new Location(4, 8), new Bug(Color.RED));
        world.add(new Location(5, 2), new Bug(Color.RED));
        world.add(new Location(5, 4), new Bug(Color.RED));
        world.add(new Location(6, 6), new Bug(Color.RED));
        world.add(new Location(6, 8), new Bug(Color.RED));
        world.add(new Location(7, 2), new Bug(Color.RED));
        world.add(new Location(7, 4), new Bug(Color.RED));
        world.add(new Location(2, 6), new Bug(Color.RED));
        world.add(new Location(2, 8), new Bug(Color.RED));
        
        world.add(new Location(0, 1), new EaterCritter(Color.CYAN));
        
        Critter x = new Critter();
        x.setColor(Color.GREEN);
        //world.add(new Location(0, 8), x);
        Critter y = new Critter();
        y.setColor(Color.BLUE);
        //world.add(new Location(9, 1), y);
        Critter z = new Critter();
        z.setColor(Color.MAGENTA);
        //world.add(new Location(9, 8), z);
        
        world.show();
    }
}
