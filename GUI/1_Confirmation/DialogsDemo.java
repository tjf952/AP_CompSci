import javax.swing.*;

/**
 * Write a description of class OKdemo here.
 * 
 * @author (C.Sarkar) 
 * @version (5/7/13)
 */
public class DialogsDemo
{
    public static void main(String [] args) {
        // simple dialog
        JOptionPane.showMessageDialog(null, "Hello, world!", "AP Computer Science: Mr. Sarkar", 1);
        JOptionPane.showMessageDialog(null, "GoodBye, world!", "AP Computer Science: Mr. Sarkar", 
            JOptionPane.ERROR_MESSAGE);
            
        // using a dialog with an existing frame
        JFrame x = new JFrame();
        JOptionPane.showMessageDialog(x, "Hello, world!", "AP Computer Science: Mr. Sarkar", 1);
        
        
        // simple yes/no dialog
        int reply = JOptionPane.showConfirmDialog(null, // do we use an existing frame
            "Would you like green eggs and ham?",       // question asked of user
            "An Inane Question",                        // custom title
            JOptionPane.YES_NO_OPTION);                 // icon displayed
        
        if (reply == JOptionPane.YES_OPTION) {            // check what the user replied
            System.out.println("\fYou typed yes.");
        	JOptionPane.showMessageDialog(null, "Well, good for you, I'm not making it though...");
    	} else {
            System.out.println("\fYou typed no.");
            JOptionPane.showMessageDialog(null, "More for me then.");
    	}
    }
}
