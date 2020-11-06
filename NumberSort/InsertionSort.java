import java.util.*;
public class InsertionSort
{
    public static void ISort(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            int x = nums[i];
            while((i-1 >= 0) && (nums[i-1] > x)){
                nums[i] = nums[i-1];
                i--;
            }
            nums[i] = x;
        }
    }
    public static void main(String[]args){
        System.out.println("Insertion Sort");
        // Creates scanner to read input
        Scanner keyboard = new Scanner(System.in);
        // Asks and assigns a name to user
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("\nOh! Hello " + name + "!");
        // Asks how many ints the user wants to sort
        System.out.println("How many numbers do you want to sort?");
        int n = keyboard.nextInt();
        // Creates int array of n ints
        int[] nums = new int[n];
        // Provides the ints for sorting
        System.out.println("\nOkay, so I'll sort " + n + " numbers " + name + ", just punch em' in!");
        int counter = 0;
        while(counter < n){
            nums[counter] = keyboard.nextInt();
            counter++;
        }
        System.out.println("\nOkay, let me sort these for you " + name + "...\n");
        // Prints array before sort
        System.out.println("So, before I sorted them the numbers were:\t");
        for(int number: nums){
            System.out.print(number + " | ");
        }
        ISort(nums);
        // After Sort
        System.out.println("\n\nAfter the sort, they look like this:\t");
        for(int number: nums){
            System.out.print(number + " | ");
        }
        // Concludes process
        System.out.println("\n\nWell, it was great helping you " + name + "! \nLook forward to the next time!");
        keyboard.close();
    }
}