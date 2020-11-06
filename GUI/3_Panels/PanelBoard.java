import javax.swing.*;
import java.awt.*;
/**
 * Six buttons in two panels - four in first panel, two in second panel
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PanelBoard
{
   public static void main(String [] args) {
       JButton []  buttons = new JButton[5]; // create six button pointers
       buttons[0] = new JButton("UP");
       buttons[1] = new JButton("LEFT");
       buttons[2] = new JButton("NEW GAME");
       buttons[3] = new JButton("RIGHT");
       buttons[4] = new JButton("DOWN");
       // create one frame and two panels
       JFrame frame = new JFrame();
       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       JPanel panel3 = new JPanel();
       
       frame.setLayout(new GridLayout(3,1)); // 2 rows, 1 column
       panel1.setLayout(new GridLayout(1,1)); // 1 row, 4 columns
       panel2.setLayout(new GridLayout(1,3)); // 1 row, 2 columns
       panel3.setLayout(new GridLayout(1,1)); // 1 row, 2 columns
       
       panel1.add(buttons[0]);   // add the buttons to the frame
       panel2.add(buttons[1]);   // add the buttons to the frame
       panel2.add(buttons[2]);   // add the buttons to the frame
       panel2.add(buttons[3]);   // add the buttons to the frame
       panel3.add(buttons[4]);   // add the buttons to the frame
  
       // now add the panels to the frame
       frame.add(panel1);
       frame.add(panel2);
       frame.add(panel3);
       // fixes the size of the frame for display
       frame.setSize(400, 300); //setSize(length, height)
       frame.setVisible(true);
   }
}