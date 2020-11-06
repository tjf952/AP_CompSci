import info.gridworld.actor.Bug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class RecBug extends Bug
{
    private int steps;
    private boolean horizontal;
    private int length;
    private int width;

    public RecBug(int length, int width)
    {
        this.setColor(Color.CYAN);
        this.setDirection(Location.WEST);
        this.length = length;
        this.width = width;
        this.steps = 0;
        this.horizontal = true;
    }

    public void act()
    {
        if (horizontal){
            if(steps < width && canMove())
            {
                move();
                steps++;
            }else{
                turn();
                turn();
                steps = 0;
                horizontal = false;
            }
        }else if(!(horizontal)){
            if(steps < length && canMove())
            {
                move();
                steps++;
            }else{
                turn();
                turn();
                steps = 0;
                horizontal = true;
            }
        }
    }

    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(6, 6), new RecBug(3,5));
        world.show();
    }
}
