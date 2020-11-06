import java.util.*;
public class BubbleSort
{
    public static void BSort(int[] nums){
        int counter = 0;
        while(counter < nums.length){
            for(int i = 0; i < nums.length-1; i++){
                if(nums[i] > nums[i+1]){
                    int copy = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = copy;
                }
            }
            counter++;
        }
    }
    public static void main(String[]args){
        System.out.println("Selection Sort");
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
        // Sorts using wanted sort
        BSort(nums);
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
