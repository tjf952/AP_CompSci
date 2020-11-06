import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NoughtsAndCrosses implements ActionListener
{    
    //try{Thread.sleep(1000);}catch(InterruptedException a){}
    JFrame board;
    protected static TButton[] buttons;
    private JButton newGame = new JButton("New Game");
    static int x = 0;
    static int o = 0;
    private JButton a = new JButton("X Score: " + x);
    private JButton b = new JButton("O Score: " + o);
    int move = 0;
    boolean gameOver = false;
    public NoughtsAndCrosses(){
        board = new JFrame();
        board.setLayout(new GridLayout(4,3));
        buttons = new TButton[9];
        for(int i = 0; i < buttons.length; i++){
            buttons[i] = new TButton();
            TButton temp = buttons[i];
            temp.addActionListener(this);
            temp.setBackground(Color.CYAN);
            board.add(temp);
        }
        board.add(a);
        board.add(newGame);
        board.add(b);
        a.addActionListener(this);
        newGame.addActionListener(this);
        b.addActionListener(this);
        board.setSize(500,300);
        board.setVisible(true);
        userChoice();
    }
    public void userChoice(){
        int choice = JOptionPane.showConfirmDialog(null, // do we use an existing frame
            "Would you like to go first?",       // question asked of user
            "Who goes first?",                        // custom title
            JOptionPane.YES_NO_OPTION);    // icon displayed
        if (choice == JOptionPane.NO_OPTION){           
            compMove();
        }
    }
    public void compMove(){
        int x = (int)(Math.random()*buttons.length);
        TButton temp = buttons[x];
        if(gameOver == true){
            return;
        }else if(temp.getText().equals("")){
            temp.setText("O");
            temp.setBackground(Color.darkGray);
        } else if(temp.getText().equals("X") || temp.getText().equals("O")){
            compMove();
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == newGame){
            int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(answer == JOptionPane.NO_OPTION){
                System.exit(0);
            }else{
                board.setVisible(false);
                new NoughtsAndCrosses();
            }
        }else if(e.getSource() == a){
            JOptionPane.showMessageDialog(null, "X Score: " + x);
        }else if(e.getSource() == b){
            JOptionPane.showMessageDialog(null, "O Score: " + o);
        } else {
            ((TButton)e.getSource()).buttonPress();
            move++;
            compMove();
            move++;
            gameStatus();
        }
    }
    public void gameStatus(){
        if(move == 9 && !(win())){
            JOptionPane.showMessageDialog(null, "Game Over\nIt's a Tie");
            gameOver = true;
        }else{
            win();
        }
    }
    public boolean win(){
        //User Wins
        if (buttons[0].getText() == buttons[1].getText() && buttons[1].getText() == buttons[2].getText() && buttons[0].getText() == "X")
        {
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }else if (buttons[3].getText() == buttons[4].getText() && buttons[4].getText() == buttons[5].getText() && buttons[3].getText() == "X"){
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }else if (buttons[6].getText() == buttons[7].getText() && buttons[7].getText() == buttons[8].getText() && buttons[6].getText() == "X"){
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }else if (buttons[0].getText() == buttons[3].getText() && buttons[3].getText() == buttons[6].getText() && buttons[0].getText() == "X"){
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }else if (buttons[1].getText() == buttons[4].getText() && buttons[4].getText() == buttons[7].getText() && buttons[1].getText() == "X"){
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }else if (buttons[2].getText() == buttons[5].getText() && buttons[5].getText() == buttons[8].getText() && buttons[2].getText() == "X"){
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }else if (buttons[0].getText() == buttons[4].getText() && buttons[4].getText() == buttons[8].getText() && buttons[0].getText() == "X"){
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }else if (buttons[2].getText() == buttons[4].getText() && buttons[4].getText() == buttons[6].getText() && buttons[2].getText() == "X"){
            JOptionPane.showMessageDialog(null, "You won! But can you win again?");
            x++;
            gameOver = true;
            return true;
        }
        // Comp Wins
        else if (buttons[0].getText() == buttons[1].getText() && buttons[1].getText() == buttons[2].getText() && buttons[0].getText() == "O")
        {
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }else if (buttons[3].getText() == buttons[4].getText() && buttons[4].getText() == buttons[5].getText() && buttons[3].getText() == "O"){
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }else if (buttons[6].getText() == buttons[7].getText() && buttons[7].getText() == buttons[8].getText() && buttons[6].getText() == "O"){
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }else if (buttons[0].getText() == buttons[3].getText() && buttons[3].getText() == buttons[6].getText() && buttons[0].getText() == "O"){
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }else if (buttons[1].getText() == buttons[4].getText() && buttons[4].getText() == buttons[7].getText() && buttons[1].getText() == "O"){
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }else if (buttons[2].getText() == buttons[5].getText() && buttons[5].getText() == buttons[8].getText() && buttons[2].getText() == "O"){
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }else if (buttons[0].getText() == buttons[4].getText() && buttons[4].getText() == buttons[8].getText() && buttons[0].getText() == "O"){
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }else if (buttons[2].getText() == buttons[4].getText() && buttons[4].getText() == buttons[6].getText() && buttons[2].getText() == "O"){
            JOptionPane.showMessageDialog(null, "Computer wins... :(");
            o++;
            gameOver = true;
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        new NoughtsAndCrosses();
    }
}
