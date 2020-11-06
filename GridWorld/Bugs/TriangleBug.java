import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import java.awt.Color;

public class TriangleBug extends Bug
{
    private int length;
    private int steps;
    private int segment = 1;
    
    public TriangleBug(int myLength){
        setDirection(Location.WEST);
        length = myLength;
        steps = 0;
    }
    
    @Override
    public void act(){
        if(canMove() && steps < length){
            move();
            steps++;
        } else 
        /*if(segment == 1){
            setDirection(Location.NORTH);
            segment++;
            steps = 0;
        }else if(segment == 2){
            setDirection(Location.SOUTHEAST);
            segment++;
            steps = 0;
        }else if(segment == 3){
            setDirection(Location.WEST);
            segment = 1;
            steps = 0;
        }*/
        {
            turn();
        }
    }
    
    @Override
    public void turn(){
        if(segment == 1){
            setDirection(Location.NORTH);
            segment++;
            steps = 0;
        } else
        if(segment == 2){
            setDirection(Location.SOUTHEAST);
            segment++;
            steps = 0;
        } else
        if(segment == 3){
            setDirection(Location.WEST);
            segment = 1;
            steps = 0;
        }
    }
    
   
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        TriangleBug floyd = new TriangleBug(2);
        floyd.setColor(Color.CYAN);
        world.add(new Location(6, 5), floyd);
        
        TriangleBug casey = new TriangleBug(5);
        casey.setColor(Color.BLUE);
        world.add(new Location(7, 7), casey);
        
        TriangleBug mac = new TriangleBug(8);
        mac.setColor(Color.CYAN);
        world.add(new Location(8, 9), mac);
        
        world.show();
    }
}
