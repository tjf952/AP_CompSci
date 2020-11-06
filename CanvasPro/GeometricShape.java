import java.awt.Color;
public abstract class GeometricShape
{
   // Protected classification will allow access in derived classes
   protected Color color; 
   protected static final Color DEFAULTCOLOR = Color.GREEN;
   // Didn't change or add anything to this one
   protected abstract void draw();
   public abstract void makeVisible();
   // Change color method for shapes
   public void changeColor(Color newColor) {
       color = newColor;
       draw();
   }
   // Move methods
   public abstract void moveHorizontal(int pixelCount);
   public abstract void moveVertical(int pixelCount);
   // Calls move horizontal method
   public void move(int pixelCount) {
       moveHorizontal(pixelCount);
   }
}
