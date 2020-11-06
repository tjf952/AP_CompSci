import java.awt.*;
import info.gridworld.actor.*;
public class EasterEgg extends Rock
{
    private Color col;
    public EasterEgg()
    {
        Color[] colors ={Color.RED,Color.GREEN,Color.BLUE,Color.CYAN,Color.MAGENTA};
        col = colors[(int)(Math.random()*(colors.length))];
        this.setColor(col);
    }
}
