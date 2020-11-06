import java.util.*;
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
    public static void main(String[]args){
        ArrayList<Object> things = new ArrayList<Object>();
        
        Rect sky = new Rect();
        sky.changeSize(500, 1500);
        sky.changeColor("blue");
        sky.moveHorizontal(-100);
        sky.moveVertical(-150);
        sky.makeVisible();
        
        Sun s = new Sun();
        s.shiftHorizontal(800);
        
        Rect bg = new Rect();
        bg.changeSize(500,1500);
        bg.changeColor("green");
        bg.moveHorizontal(-100);
        bg.moveVertical(350);
        bg.makeVisible();
        
        Rect r1 = new Rect();
        r1.changeSize(260,300);
        r1.changeColor("magenta");
        r1.moveHorizontal(275);
        r1.moveVertical(275);
        r1.makeVisible();
        
        Cloud c1 = new Cloud();
        c1.shiftHorizontal(400);
        things.add(c1);
        
        Cloud c2 = new Cloud();
        c2.shiftHorizontal(100);
        c2.shiftVertical(100);
        things.add(c2);
        
        Cloud c3 = new Cloud();
        c3.shiftHorizontal(-200);
        c3.shiftVertical(200);
        things.add(c3);
        
        Rect r2 = new Rect();
        r2.changeSize(30,350);
        r2.changeColor("black");
        r2.moveHorizontal(250);
        r2.moveVertical(275);
        r2.makeVisible();
        
        Rect r3 = new Rect();
        r3.changeSize(30,300);
        r3.changeColor("white");
        r3.moveHorizontal(275);
        r3.moveVertical(245);
        r3.makeVisible();
        
        Rect r4 = new Rect();
        r4.changeSize(30,350);
        r4.changeColor("black");
        r4.moveHorizontal(250);
        r4.moveVertical(225);
        r4.makeVisible();
        
        Rect r5 = new Rect();
        r5.changeSize(30,300);
        r5.changeColor("white");
        r5.moveHorizontal(275);
        r5.moveVertical(195);
        r5.makeVisible();
        
        Rect r6 = new Rect();
        r6.changeSize(40,300);
        r6.changeColor("black");
        r6.moveHorizontal(275);
        r6.moveVertical(165);
        r6.makeVisible();
        
        Triangle t1 = new Triangle();
        t1.changeColor("black");
        t1.changeSize(40, 80);
        t1.moveHorizontal(285);
        t1.moveVertical(200);
        t1.makeVisible();
        
        Triangle t2 = new Triangle();
        t2.changeColor("black");
        t2.changeSize(40, 80);
        t2.moveHorizontal(585);
        t2.moveVertical(200);
        t2.makeVisible();
        
        Square s1 = new Square();
        s1.changeColor("blue");
        s1.changeSize(70);
        s1.moveHorizontal(320);
        s1.moveVertical(340);
        s1.makeVisible();
        
        Square s2 = new Square();
        s2.changeColor("blue");
        s2.changeSize(70);
        s2.moveHorizontal(460);
        s2.moveVertical(340);
        s2.makeVisible();
        
        Rect door = new Rect();
        door.changeColor("white");
        door.changeSize(90,60);
        door.moveHorizontal(395);
        door.moveVertical(445);
        door.makeVisible();
        
        Circle k = new Circle();
        k.changeSize(10);
        k.moveHorizontal(480);
        k.moveVertical(475);
        k.changeColor("black");
        k.makeVisible();
        /*
        for(Object o : things){
            ((Cloud)o).move(100);
        }
        */
        s.move(300);
    }
}
