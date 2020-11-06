import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Six buttons in two panels - four in first panel, two in second panel
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game2048 implements ActionListener
{
    GameBoard2048 gB = new GameBoard2048();
    JButton a1 = new JButton("UP");
    JButton a2 = new JButton("LEFT");
    JButton a3 = new JButton("NEW GAME");
    JButton a4 = new JButton("RIGHT");
    JButton a5 = new JButton("DOWN");

    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    public Game2048(){
        frame.setLayout(new GridLayout(3,1)); 
        panel1.setLayout(new GridLayout(1,1)); 
        panel2.setLayout(new GridLayout(1,3)); 
        panel3.setLayout(new GridLayout(1,1));

        panel1.add(a1);   // add the buttons to the frame
        panel2.add(a2);   // add the buttons to the frame
        panel2.add(a3);   // add the buttons to the frame
        panel2.add(a4);   // add the buttons to the frame
        panel3.add(a5);   // add the buttons to the frame

        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setSize(400, 200); 
        frame.setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e) {
        if (e.getSource() == a1){
            gB.pressUp();
        }else if (e.getSource() == a2){
            gB.pressLeft();
        }else if (e.getSource() == a3){
            /*
            int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(answer == JOptionPane.NO_OPTION){
                System.exit(0);
            }else{
                frame.setVisible(false);
                gB.board.setVisible(false);
                Game2048 newGame = new Game2048();
            }
            */
            frame.setVisible(false);
            gB.board.setVisible(false);
            new Game2048();
        }else if (e.getSource() == a4){
            gB.pressRight();
        }else if (e.getSource() == a5){
            gB.pressDown();
        }else{
            JOptionPane.showMessageDialog(null, "Error.message()", "Error", 1);
        }
    }

    public static void main(String[]args){
        new Game2048();
    }
}