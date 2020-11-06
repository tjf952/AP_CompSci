import java.util.*;
public class BinarySearch
{
    public static int find(int[]x , int target){
        int len = x.length;
        if(len <= 1){
            if(x[0] != target){
                return -1;
            }
            return 0;
        }
        if(target < x[len/2]){
            return find(Arrays.copyOfRange(x, 0, len/2), target);
        }
        return len/2 + find(Arrays.copyOfRange(x, len/2, len), target);
    }
    public static void main(String[]args){
        // if(find(int[] x, target) == x.length), number was not found
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        System.out.println("Ans: " + find(nums, 4) + "; Should be: 3;");
        System.out.println("Ans: " + find(nums, 5) + "; Should be: 4;");
        System.out.println("Ans: " + find(nums, 3) + "; Should be: 2;");
        System.out.println("Ans: " + find(nums, 1) + "; Should be: 0;");
        System.out.println("Ans: " + find(nums, 9) + "; Should be: -x;\n");
    }
}
