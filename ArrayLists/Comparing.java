import java.util.ArrayList;
public class Comparing
{
    public static void main(String[]args){
        ArrayList<String> x = new ArrayList<String>();
        x.add("Laura");
        x.add("Angela");
        x.add("Casey");
        x.add("Zatana");
        x.add("Kara");
        x.add("Claire");
        x.add("*Natalie");
        x.add("Briana");
        x.add("Allison");
        System.out.println("Version 1: \n" + x + "\nCalculating order...");
        for(int i = 0; i < x.size(); i++){
            for(int j = i + 1; j < x.size(); ++j){
                if(x.get(i).compareTo(x.get(j)) > 0){
                    String newString = x.get(j);
                    x.set((j), x.get(i));
                    x.set(i, newString);
                }
            }
        }
        /*for(int i = 0; i < x.size(); i++){
            System.out.println((i+1) + ". " + x.get(i));
        }*/
        System.out.println(x);
                
        ArrayList<String> y = new ArrayList<String>();
        y.add("Laura");
        y.add("Angela");
        y.add("Casey");
        y.add("Zatana");
        y.add("Kara");
        y.add("Claire");
        y.add("*Natalie");
        y.add("Briana");
        y.add("Allison");
        System.out.println("\nVersion 2:\n" + y);
        for(int i = 0; i < y.size(); i++){
            for(int j = i + 1; j < y.size(); ++j){
                if(y.get(j).compareTo(y.get(i)) > 0){
                    String newString = y.get(j);
                    y.set((j), y.get(i));
                    y.set(i, newString);
                }
            }
        }
        System.out.println("Calculating order...\n" + y);
    }
}
