import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import java.awt.Color;

public class ZBug extends Bug
{
    int segmentLength;
    int segment;
    int steps;
    
    public ZBug(int length){ 
        setDirection(Location.EAST); 
        steps = 0; 
        segment = 1; 
        segmentLength = length; 
    } 
 
    public void act() 
    { 
        if (segment <= 3 && steps < segmentLength) 
        { 
            if (canMove()) 
            { 
                move(); 
                steps++; 
            } 
        } 
        else if (segment == 1) 
        { 
            setDirection(Location.SOUTHWEST); 
            steps = 0; 
            segment++; 
        } 
        else if (segment == 2) 
        { 
            setDirection(Location.EAST); 
            steps = 0; 
            segment++; 
        } 
    } 
    
    public static void main(String[]args){
        ActorWorld world = new ActorWorld();
        ZBug floyd = new ZBug(3);
        floyd.setColor(Color.ORANGE);
        world.add(new Location(2, 2), floyd);
        world.show();
    }
} 