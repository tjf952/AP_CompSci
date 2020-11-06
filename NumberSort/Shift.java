
public class Shift
{
    public static void shift(int[]nums){
        int swap = nums[nums.length-1];
        int stop = 0;
        for(int i = 0; i < nums.length; i++){
            if(swap < nums[i]){
                stop = i;
                i = nums.length;
            } 
        }
        for(int j = nums.length-2; j >= stop; j--){
            nums[j+1] = nums[j];
        }
        nums[stop] = swap;
    }
    public static int[] addedShift(int[]nums, int x){
        int swap = x;
        int stop = 0;
        for(int i = 0; i < nums.length; i++){
            if(swap < nums[i]){
                stop = i;
                i = nums.length;
            }
        }
        for(int j = nums.length-2; j >= stop; j--){
            nums[j+1] = nums[j];
        }
        nums[stop] = swap;
        return nums;
    }
    public static void main(String[]args){
        int[]nums = new int[6];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 3;
        nums[3] = 1;
        nums[4] = 9;
        nums[5] = 6;
        System.out.println("Before: ");
        for(int number: nums){
            System.out.print(number + " | ");
        }
        shift(nums);
        System.out.println("\nAfter: ");
        for(int number: nums){
            System.out.print(number + " | ");
        }
    }
}
