import java.util.*;
public class ArraySort
{
    public static void main(String[]args){
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = -3;
        numbers[2] = 7;
        numbers[3] = 4;
        numbers[4] = -92;
        System.out.println("Before Sort:\t");
        for(int x: numbers){
            System.out.print(x + " | ");
        }
        Arrays.sort(numbers);
        System.out.println("\nAfter Sort:\t");
        for(int x: numbers){
            System.out.print(x + " | ");
        }
    }
}
