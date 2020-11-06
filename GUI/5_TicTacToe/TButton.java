import javax.swing.*;
import java.awt.*;
public class TButton extends JButton
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TButton()
    {
        super("");
    }
    public void buttonPress(){
        if (this.getText().equals("")){
            this.setText("X");
            this.setBackground(Color.BLUE);
        }else if (this.getText().equals("X")){
            this.setText("O");
            this.setBackground(Color.darkGray);
        }else{
            this.setText("");
            this.setBackground(Color.CYAN);
        }
    }
}
