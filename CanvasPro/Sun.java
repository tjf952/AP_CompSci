import java.util.*;
/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    ArrayList<Circle> s;

    public Sun(){
        s = new ArrayList<Circle>();

        Circle c1 = new Circle();
        c1.changeColor("yellow");
        c1.moveVertical(0);
        c1.changeSize(100);
        c1.makeVisible();
        s.add(c1);

        Circle c2 = new Circle();
        c2.changeColor("yellow");
        c2.changeSize(20);
        c2.moveHorizontal(105);
        c2.moveVertical(40);
        c2.makeVisible();
        s.add(c2);

        Circle c3 = new Circle();
        c3.changeColor("yellow");
        c3.changeSize(20);
        c3.moveHorizontal(-25);
        c3.moveVertical(40);
        c3.makeVisible();
        s.add(c3);
        
        Circle c4 = new Circle();
        c4.changeColor("yellow");
        c4.changeSize(20);
        c4.moveHorizontal(40);
        c4.moveVertical(-25);
        c4.makeVisible();
        s.add(c4);

        Circle c5 = new Circle();
        c5.changeColor("yellow");
        c5.changeSize(20);
        c5.moveHorizontal(40);
        c5.moveVertical(105);
        c5.makeVisible();
        s.add(c5);
        //---------------------------------
        Circle c6 = new Circle();
        c6.changeColor("yellow");
        c6.changeSize(20);
        c6.moveHorizontal(-8);
        c6.moveVertical(-6);
        c6.makeVisible();
        s.add(c6);

        Circle c7 = new Circle();
        c7.changeColor("yellow");
        c7.changeSize(20);
        c7.moveHorizontal(88);
        c7.moveVertical(-6);
        c7.makeVisible();
        s.add(c7);
        
        Circle c8 = new Circle();
        c8.changeColor("yellow");
        c8.changeSize(20);
        c8.moveHorizontal(88);
        c8.moveVertical(88);
        c8.makeVisible();
        s.add(c8);

        Circle c9 = new Circle();
        c9.changeColor("yellow");
        c9.changeSize(20);
        c9.moveHorizontal(-8);
        c9.moveVertical(88);
        c9.makeVisible();
        s.add(c9);
    }

    public void shiftHorizontal(int pixels){
        for(Circle c : s){
            c.moveHorizontal(pixels);
        }
    }

    public void shiftVertical(int pixels){
        for(Circle c : s){
            c.moveVertical(pixels);
        }
    }

    public void move(int pixels)
    {
        for(int i = 0; i < pixels; i++){  
            for(Circle c : s){
                c.slowMoveVertical(1);
            }
        }
    }

}
