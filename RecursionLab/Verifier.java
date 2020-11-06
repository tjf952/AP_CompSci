public class Verifier
{
    public static boolean arrayVerifier(int[] nums, int index){
        if(nums.length-1 == index){
            return true;
        }
        if(nums[index] <= nums[index + 1]){
            return arrayVerifier(nums, index+1);
        }
        return false;
    }
    public static void main(String[]args){
        int[] nums = new int[3];
        int[] list = new int[3];
        nums[0] = 1;
        nums[1] = 5;
        nums[2] = 9;
        list[0] = 5;
        list[1] = 8;
        list[2] = 2;
        System.out.println("TRUE: " + arrayVerifier(nums, 0));
        System.out.println("FALSE: " + arrayVerifier(list, 0));
    }
}