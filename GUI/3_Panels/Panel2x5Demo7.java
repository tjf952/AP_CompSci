import javax.swing.*;
import java.awt.*;
/**
 * Six buttons in two panels - four in first panel, two in second panel
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panel2x5Demo7
{
   public static void main(String [] args) {
       JButton []  buttons = new JButton[10]; // create ten button pointers
       for (int i=0; i<10; ++i)
            buttons[i] = new JButton("Button" + (i+1)); // labels are 1-10
       
       // create one frame and five panels
       JFrame frame = new JFrame();
       JPanel [] panels = new JPanel[5]; 
       
       frame.setLayout(new GridLayout(5,1)); // 5 rows, 1 column
       for (int i=0; i<5; ++i)
       {
           panels[i] = new JPanel();
           panels[i].setLayout(new GridLayout(1,2)); // 1 row, 2 columns
       }
       
       // add the buttons to the panel
       panels[0].add(buttons[0]);
       panels[0].add(buttons[1]);
       panels[1].add(buttons[2]);
       panels[1].add(buttons[3]);
       panels[2].add(buttons[4]);
       panels[2].add(buttons[5]);
       panels[3].add(buttons[6]);
       panels[3].add(buttons[7]);
       panels[4].add(buttons[8]);
       panels[4].add(buttons[9]);
  
       // now add the panels to the frame
       for (int i=0; i<5; ++i)
            frame.add(panels[i]);    // add each panel to the frame

       // fixes the size of the frame for display
       frame.setSize(200, 800); //setSize(length, height)
       frame.setVisible(true);
   }
}