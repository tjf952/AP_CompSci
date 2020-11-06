import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * ActionListenerDemo - which button did I press?
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Action implements ActionListener
{
    // instance variables
       JButton button1 = new JButton("Yes");
       JButton button2 = new JButton("No");
       JFrame frame = new JFrame();
   // constructor
   public Action() {   

       // put buttons side by side - not one one top of another
       frame.setLayout(new GridLayout()); 
       frame.add(button1); // add the buttons to the frame
       frame.add(button2);
       
       // configure the buttons so when pressed, method actionPerformed() is called
       button1.addActionListener(this); // the current object handles button press
       button2.addActionListener(this);
       
       // fixes the size of the frame for display
       frame.setSize(250, 100); //setSize(length, height)
       frame.setVisible(true);
   }
  
   // method actionPerformed() must be defined if ActionListener is implemented
   @Override
   public  void actionPerformed(ActionEvent e) {
       if (e.getSource() == button1)
            JOptionPane.showMessageDialog(null, "That was EASY", "Which Button?", 1);
       else 
            JOptionPane.showMessageDialog(null, "Boo", "Which Button?", 1);
   }
}