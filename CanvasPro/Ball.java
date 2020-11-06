
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball
{
    public static void main (String [] args)
    {
        Circle c1 = new Circle();
        c1.moveHorizontal(480);
        c1.moveVertical(440);
        c1.makeVisible();
        c1.changeSize(50);
        c1.changeColor("magenta");
        c1.changeSize(100);
        c1.changeColor("black");
        c1.slowMoveHorizontal(-400);
        c1.slowMoveVertical(-430);
        c1.slowMoveHorizontal(700);
        c1.slowMoveVertical(430);
    }
}
