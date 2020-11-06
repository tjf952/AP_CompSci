import java.util.*;
public class SelectionSort
{
    public static void SSort(int[] nums) {
        // Parses through nums and takes each value of nums[i]
        for(int i = 0; i < nums.length-1; i++) {
            // Creates min int
            int min = i;
            // Looks at the numbers in front of nums[i] which is assigned nums[j]
            for (int j = i+1; j < nums.length; j++) {
                // Assigns minimum value to some nums[j]
                if(nums[j] < nums[min]){
                    min = j;
                } 
            }
            if (nums[i] > nums[min]) {
                    int copy = nums[i];
                    nums[i] = nums[min];
                    nums[min] = copy;
            }
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
        SSort(nums);
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