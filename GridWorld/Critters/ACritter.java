import java.util.*;
import java.awt.*;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class ACritter extends Critter
{
    Color newColor;
    public ACritter(Color col){
        newColor = col;
        this.setColor(newColor);
    }
    public ArrayList<Actor> getActors(){
        /*
        Gets the actors for processing. Implemented to return the 
        actors that occupy neighboring grid locations. Override this
        method in subclasses to look elsewhere for actors to process.
        */
        return super.getActors();
    }
    public void processActors(ArrayList<Actor> actors){
        /*
        Processes the elements of actors. New actors may be added 
        to empty locations. Implemented to "eat" (i.e. remove)
        selected actors that are not rocks or critters. Override
        this method in subclasses to process actors in a different way. 
        */
       super.processActors(actors);
    }
    public ArrayList<Location> getMoveLocations(){
        /*
        Gets a list of possible locations for the next move. 
        These locations must be valid in the grid of this critter. 
        Implemented to return the empty neighboring locations. 
        Override this method in subclasses to look elsewhere for 
        move locations.
        */
       return super.getMoveLocations();
    }
    public Location selectMoveLocation(ArrayList<Location> locs){
        /*
        Selects the location for the next move. Implemented 
        to randomly pick one of the possible locations, or to 
        return the current location if locs has size 0. Override 
        this method in subclasses that have another mechanism for
        selecting the next move location. 
        */
       return super.selectMoveLocation(locs);
    }
    public void makeMove(Location loc){
        /*
        Moves this critter to the given location loc, or removes 
        this critter from its grid if loc is null. An actor may be
        added to the old location. If there is a different actor at
        location loc, that actor is removed from the grid. Override
        this method in subclasses that want to carry out other 
        actions (for example, turning this critter or adding an 
        occupant in its previous location). 
        */
       super.makeMove(loc);
    }
}
