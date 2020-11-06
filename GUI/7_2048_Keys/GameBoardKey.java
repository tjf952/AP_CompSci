import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameBoardKey implements KeyListener
{    
    protected static JFrame board;
    protected GButton[][] buttons;
    protected JButton[] scoring;
    int tile = 0;
    int score = 0;
    boolean gameOver = false;
    boolean move = true;
    
    public GameBoardKey(){
        board = new JFrame();
        board.setLayout(new GridLayout(5,4));
        buttons = new GButton[4][4];
        for(int i = 0; i < buttons[0].length; i++){
            for(int j = 0; j < buttons.length; j++){
                buttons[i][j] = new GButton();
                GButton temp = buttons[i][j];
                board.add(temp);
                tile = temp.getNum();
            }
        }
        addDigit();
        addDigit();
        scoreKeeper();
        board.setSize(500,500);
        board.setVisible(true);
        board.addKeyListener(this);
        board.setFocusable(true);
        //board.setPositionRelativeTo(null);
    }
    
    public void scoreKeeper(){
        scoring = new JButton[4];
        for(int i = 0; i < scoring.length; i++){
            scoring[i] = new JButton();
            if(i == 1){
                scoring[i].setText("Score:");
            }
            if(i == 2){
                scoring[i].setText("" + score);
            }
            board.add(scoring[i]);
        }
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            pressUp();
        } else if(key == KeyEvent.VK_DOWN){
            pressDown();
        } else if(key == KeyEvent.VK_RIGHT){
            pressRight();
        } else if(key == KeyEvent.VK_LEFT){
            pressLeft();
        } else if(key == KeyEvent.VK_ENTER){
            board.setVisible(false);
            new GameBoardKey();
        }
    }

    public void keyTyped(KeyEvent e){
        // Not needed
    }

    public void keyReleased(KeyEvent e){
        // Not needed
    }

    public void addDigit(){
        int x = (int)(Math.random()*buttons[0].length);
        int y = (int)(Math.random()*buttons.length);
        GButton temp = buttons[x][y];
        int[] choices = {2,2,2,4};
        int num = (int)(Math.random()*choices.length);
        if(gameOver == true){
            JOptionPane.showMessageDialog(null, "Game Over\nScore: " + score);
            gameOver = false;
        }else if(temp.getText().equals("")){
            temp.setNum(choices[num]);
            checkGame();
        } else{
            addDigit();
        }
    }

    public void pressUp(){
        move = true;
        for(int i = 0; i < buttons[0].length; i++){
            //vertical length; goes through cols
            for(int j = 0; j < buttons.length; j++){
                GButton first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = i + 1; a < buttons[0].length; a++){
                        GButton next = buttons[a][j];
                        if(next.getNum() != 0){
                            first.setNum(next.getNum());
                            next.remove();
                            move = false;
                            break;
                        }
                    }
                }
                if (first.getNum() != 0){
                    for(int a = i + 1; a < buttons[0].length; a++){
                        GButton next = buttons[a][j];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
                            score += (first.combined(next).getNum());
                            scoring[2].setText("" + score);
                            move = false;
                            break;
                        }
                    }
                }
            }
        }
        if(!(move)){
            addDigit();
        }
    }

    public void pressDown(){
        move = true;
        for(int i = buttons[0].length - 1; i >= 0; i--){
            //vertical length; goes through cols
            for(int j = buttons.length - 1; j >= 0; j--){
                GButton first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = i - 1; a >= 0; a--){
                        GButton next = buttons[a][j];
                        if(next.getNum() != 0){
                            first.setNum(next.getNum());
                            next.remove();
                            move = false;
                            break;
                        }
                    }
                }
                if (first.getNum() != 0){
                    for(int a = i - 1; a >= 0; a--){
                        GButton next = buttons[a][j];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
                            score += (first.combined(next).getNum());
                            scoring[2].setText("" + score);
                            move = false;
                            break;
                        }
                    }
                }
            }
        }
        if(!(move)){
            addDigit();
        }
    }

    public void pressLeft(){
        move = true;
        for(int i = 0; i < buttons.length; i++){
            //vertical length; goes through cols
            for(int j = 0; j < buttons[0].length; j++){
                GButton first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = j + 1; a < buttons.length; a++){
                        GButton next = buttons[i][a];
                        if(next.getNum() != 0){
                            first.setNum(next.getNum());
                            next.remove();
                            move = false;
                            break;
                        }
                    }
                }
                if (first.getNum() != 0){
                    for(int a = j + 1; a < buttons.length; a++){
                        GButton next = buttons[i][a];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
                            score += (first.combined(next).getNum());
                            scoring[2].setText("" + score);
                            move = false;
                            break;
                        }
                    }
                }
            }
        }
        if(!(move)){
            addDigit();
        }
    }

    public void pressRight(){
        move = true;
        for(int i = buttons.length - 1; i >= 0; i--){
            //vertical length; goes through cols
            for(int j = buttons[0].length - 1; j >= 0; j--){
                GButton first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = j - 1; a >= 0; a--){
                        GButton next = buttons[i][a];
                        if(next.getNum() != 0){
                            first.setNum(next.getNum());
                            next.remove();
                            move = false;
                            break;
                        }
                    }
                }
                if (first.getNum() != 0){
                    for(int a = j - 1; a >= 0; a--){
                        GButton next = buttons[i][a];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
                            score += (first.combined(next).getNum());
                            scoring[2].setText("" + score);
                            move = false;
                            break;
                        }
                    }
                }
            }
        }
        if(!(move)){
            addDigit();
        }
    }

    public void checkGame(){
        int available = 0;
        int max = 0;
        for(int i = 0; i < buttons[0].length; i++){
            for(int j = 0; j < buttons.length; j++){
                GButton temp = buttons[i][j];
                if(temp.getNum() > max){
                    max = temp.getNum();
                }
                if(temp.getText().equals("")){
                    available++;
                }
            }
        }
        tile = max;
        if(tile == 2048){
            JOptionPane.showMessageDialog(null, "CONGRATULATIONS!\nYOU WIN!");
            return;
        }
        if(available == 0){
            gameOver = true;
        } 
    }

    public static void main(String[]args){
        new GameBoardKey();
    }
}
