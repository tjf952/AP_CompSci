import javax.swing.*;
import java.awt.*;
public class Button2048 extends JButton
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
    public Button2048(){
        this(0);
        this.setBackground(Color.darkGray);
    }

    public Button2048(int myNum){
        num = myNum;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int rNum){
        num = rNum;
        this.setText("" + rNum);
        this.setFont(new Font("Castellar", Font.BOLD, 30));
        this.setBackground(Color.lightGray);
    }
    
    public void remove(){
        this.setNum(0);
        this.setText("");
        this.setBackground(Color.darkGray);
    }
    
    public Button2048 combined(Button2048 button){
        Button2048 newButton = new Button2048();
        newButton.setNum(this.getNum() + button.getNum());
        newButton.setFont(new Font("Castellar", Font.BOLD, 30));
        newButton.setBackground(Color.lightGray);
        return newButton;
    }
}
