import java.util.*;
/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud
{
    ArrayList<Circle> cl;

    public Cloud(){
        cl = new ArrayList<Circle>();

        Circle c1 = new Circle();
        c1.changeColor("white");
        c1.moveVertical(-20);
        c1.changeSize(80);
        c1.makeVisible();
        cl.add(c1);

        Circle c2 = new Circle();
        c2.changeColor("white");
        c2.changeSize(60);
        c2.moveHorizontal(60);
        c2.moveVertical(0);
        c2.makeVisible();
        cl.add(c2);

        Circle c3 = new Circle();
        c3.changeColor("white");
        c3.changeSize(40);
        c3.moveHorizontal(110);
        c3.moveVertical(20);
        c3.makeVisible();
        cl.add(c3);
    }

    public void shiftHorizontal(int pixels){
        for(Circle c : cl){
            c.moveHorizontal(pixels);
        }
    }

    public void shiftVertical(int pixels){
        for(Circle c : cl){
            c.moveVertical(pixels);
        }
    }

    public void move(int pixels)
    {
        for(int i = 0; i < pixels; i++){  
            for(Circle c : cl){
                c.slowMoveHorizontal(1);
            }
        }
    }

}
