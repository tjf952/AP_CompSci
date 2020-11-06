import java.util.*;
public class ArrayListSort
{
    public static void main(String[]args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(-3);
        numbers.add(7);
        numbers.add(4);
        numbers.add(-92);
        System.out.println("Before Sort:\t");
        for(int x: numbers){
            System.out.print(x + " | ");
        }
        System.out.print("\n" + numbers);
        Collections.sort(numbers);
        System.out.println("\nAfter Sort:\t");
        for(int x: numbers){
            System.out.print(x + " | ");
        }
        System.out.print("\n" + numbers);
    }
}

