import javax.swing.*;
import java.awt.*;
public class GButton extends JButton
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;

    public GButton(){
        this(0);
        this.setBackground(Color.darkGray);
    }

    public GButton(int myNum){
        num = myNum;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int rNum){
        // Changes number and font
        num = rNum;
        this.setText("" + rNum);
        this.setFont(new Font("Segoe Script", Font.BOLD, 30));
        this.setForeground(Color.white);
        // Changes background color
        float grad = (float) ((Math.log(rNum) / Math.log(2)) / 10);
        if (grad < 0F) {
            grad = 0F;
        }
        if (grad > 1F) {
            grad = 1F;
        }
        float bl = (float)(.75);
        float gr = (float)(.25);
        this.setBackground(new Color(grad, gr, bl));    
    }
    
    public void remove(){
        this.setNum(0);
        this.setText("");
        this.setBackground(Color.darkGray);
    }
    
    public GButton combined(GButton button){
        GButton newButton = new GButton();
        newButton.setNum(this.getNum() + button.getNum());
        newButton.setFont(new Font("Segoe Script", Font.BOLD, 30));
        return newButton;
    }
}
