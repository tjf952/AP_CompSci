import javax.swing.*;
public class SpiritAnimal
{
    public static void main(String[]args){
        // Choices
        Object[] choices = {"Eagle", "Bear", "Cobra", 
            "Tiger", "Elephant", "Owl"};
        
        //JFrame
        String result = (String)JOptionPane.showInputDialog(
            null, // Creates frame
            "Enter an Animal", // Heading
            "Spirit Animal", // Title
            JOptionPane.PLAIN_MESSAGE, // Font Stlye
            null, // Icon Logo
            null, // Choices
            null); // Default Answer
        if((result != null) && (result.length() > 0)){
            System.out.println("You are now a " + result + ".");
            for (Object element: choices) {
                if(element.equals(result)) {
                	System.out.println( "Your ancestors are watching over you!");
                }
            }
            return;
        }
        System.out.println("You must pick an animal.");
    }
}
