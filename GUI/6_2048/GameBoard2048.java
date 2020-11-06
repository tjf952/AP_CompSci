import javax.swing.*;
import java.awt.*;
public class GameBoard2048
{    
    JFrame board;
    protected Button2048[][] buttons;
    int score = 0;
    boolean gameOver = false;
    boolean move = true;
    public GameBoard2048(){
        board = new JFrame();
        board.setLayout(new GridLayout(4,4));
        buttons = new Button2048[4][4];
        for(int i = 0; i < buttons[0].length; i++){
            for(int j = 0; j < buttons.length; j++){
                buttons[i][j] = new Button2048();
                Button2048 temp = buttons[i][j];
                board.add(temp);
                score = temp.getNum();
            }
        }
        addDigit();
        board.setSize(500,500);
        board.setVisible(true);
    }

    public void addDigit(){
        int x = (int)(Math.random()*buttons[0].length);
        int y = (int)(Math.random()*buttons.length);
        Button2048 temp = buttons[x][y];
        int[] choices = {2,2,2,4};
        int num = (int)(Math.random()*choices.length);
        if(gameOver == true){
            JOptionPane.showMessageDialog(null, "Game Over\nScore: " + score);
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
                Button2048 first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = i + 1; a < buttons[0].length; a++){
                        Button2048 next = buttons[a][j];
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
                        Button2048 next = buttons[a][j];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
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
                Button2048 first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = i - 1; a >= 0; a--){
                        Button2048 next = buttons[a][j];
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
                        Button2048 next = buttons[a][j];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
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
                Button2048 first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = j + 1; a < buttons.length; a++){
                        Button2048 next = buttons[i][a];
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
                        Button2048 next = buttons[i][a];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
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
                Button2048 first = buttons[i][j];
                if(first.getNum() == 0){
                    for(int a = j - 1; a >= 0; a--){
                        Button2048 next = buttons[i][a];
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
                        Button2048 next = buttons[i][a];
                        if(first.getNum() == next.getNum()){
                            first.setNum(first.combined(next).getNum());
                            next.remove();
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
                Button2048 temp = buttons[i][j];
                if(temp.getNum() > max){
                    max = temp.getNum();
                }
                if(temp.getText().equals("")){
                    available++;
                }
            }
        }
        score = max;
        if(score == 2048){
            JOptionPane.showMessageDialog(null, "CONGRATULATIONS!\nYOU WIN!");
            return;
        }
        if(available == 0){
            gameOver = true;
        } 
    }
    
    public static void main(String[]args){
        new GameBoard2048();
    }
}
