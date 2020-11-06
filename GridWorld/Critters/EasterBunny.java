import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class EasterBunny extends Critter
{
    private Color col;
    private static boolean surrounded = false;

    public EasterBunny(){
        Color[] colors ={Color.RED,Color.GREEN,Color.BLUE,Color.CYAN,Color.MAGENTA};
        col = colors[(int)(Math.random()*(colors.length))];
        this.setColor(col);
    }

    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
        for(int row = 0; row < 10; ++row){
            for(int col = 0; col < 10; ++col){
                Location loc = new Location(row, col);
                if(this.getGrid().isValid(loc)){
                    Actor a = this.getGrid().get(loc);
                    if(a != null){
                        actors.add(a);
                    } 
                }
            }
        }
        return actors;
    }

    public void processActors(ArrayList<Actor> actors){
        if(surrounded == true){
            for(Actor a : actors){
                if(a instanceof EasterEgg){
                    a.removeSelfFromGrid();
                }
            }
            surrounded = false;
        }
        super.processActors(actors);
    }

    public Location selectMoveLocation(ArrayList<Location> locs){
        int n = locs.size(); 
        if(n == 0){
            surrounded = true;
        }
        return super.selectMoveLocation(locs);
    }

    public void makeMove(Location loc){
        Location last = getLocation(); 
        super.makeMove(loc); 
        if(!last.equals(loc)){ 
            EasterEgg egg = new EasterEgg(); 
            egg.putSelfInGrid(getGrid(), last); 
        } 
    }

    public static void main(String[] args)
    {
        //BoundedGrid gr = new BoundedGrid(10,10);
        ActorWorld world = new ActorWorld();
        world.add(new Location(1, 1), new Rock(Color.BLUE));
        world.add(new Location(1, 8), new Rock(Color.PINK));
        world.add(new Location(8, 8), new Rock(Color.MAGENTA));
        world.add(new Location(8, 1), new Rock(Color.CYAN));
        world.add(new Location(3, 3), new EasterBunny());
        world.add(new Location(3, 6), new EasterBunny());
        world.add(new Location(6, 3), new EasterBunny());
        world.add(new Location(6, 6), new EasterBunny());
        world.show();
    }
}