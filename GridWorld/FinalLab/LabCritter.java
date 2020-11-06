import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class LabCritter extends Critter
{
    private Color col;
    int move = 1;
    public LabCritter(Color myCol){
        col = myCol;
        this.setColor(col);
    }
    public ArrayList<Actor> getActors() {
        System.out.println("Move " + move);
        getGreenActors();
        getFlowerLoc();
        removeFlower();
        move++;
        return super.getActors();
    }
    public void getGreenActors() {
        int counter = 0;
        for(int row = 0; row < getGrid().getNumRows(); row++) {
            for(int col = 0; col < getGrid().getNumCols(); col++) {
                Location loc = new Location(row, col);
                if(getGrid().get(loc) instanceof Actor){
                    if(getGrid().get(loc).getColor() == Color.GREEN){ 
                        counter++;
                    }
                }
            }
        }
        System.out.println("\tTotal Green Actors: " + counter);
    }
    public ArrayList<Actor> getFlowers(){
        ArrayList<Actor> list = new ArrayList<Actor>();
        for(int row = 0; row < getGrid().getNumRows(); row++) {
            for(int col = 0; col < getGrid().getNumCols(); col++) {
                Location loc = new Location(row, col);
                if(getGrid().get(loc) instanceof Flower){
                    list.add(getGrid().get(loc));
                }
            }
        }
        return list;
    }
    public void getFlowerLoc(){
        for(Actor a: getFlowers()){
            System.out.println("\tFlower At Location " + a.getLocation());
        }
    }
    public void removeFlower(){
        if(getFlowers().size() > 0){
            int rand = (int)(Math.random()*getFlowers().size());
            Actor a = getFlowers().get(rand);
            a.removeSelfFromGrid();
        }
    }
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        world.add(new Location(0, 0), new Rock(Color.GREEN));
        world.add(new Location(9, 0), new Rock(Color.BLUE));
        world.add(new Location(9, 9), new Rock(Color.MAGENTA));
        world.add(new Location(0, 9), new Rock(Color.CYAN));
        
        world.add(new Location(3, 2), new Flower(Color.GREEN));
        world.add(new Location(3, 4), new Flower(Color.CYAN));
        world.add(new Location(4, 6), new Flower(Color.BLUE));
        world.add(new Location(4, 8), new Flower(Color.MAGENTA));
        world.add(new Location(5, 2), new Flower(Color.GREEN));
        world.add(new Location(5, 4), new Flower(Color.CYAN));
        world.add(new Location(6, 6), new Flower(Color.BLUE));
        world.add(new Location(6, 8), new Flower(Color.MAGENTA));
        world.add(new Location(7, 2), new Flower(Color.GREEN));
        world.add(new Location(7, 4), new Flower(Color.CYAN));
        world.add(new Location(2, 6), new Flower(Color.BLUE));
        world.add(new Location(2, 8), new Flower(Color.MAGENTA));
        
        world.add(new Location(0, 1), new LabCritter(Color.CYAN));
        
        Bug x = new Bug(Color.GREEN);
        world.add(new Location(0, 8), x);
        Bug y = new Bug(Color.BLUE);
        world.add(new Location(9, 1), y);
        Bug z = new Bug(Color.MAGENTA);
        world.add(new Location(9, 8), z);
        
        world.show();
    }
}
