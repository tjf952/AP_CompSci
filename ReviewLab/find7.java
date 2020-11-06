public class find7
{
    public static int finder(int[] nums){
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 7){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[]one = new int[3];
        one[0] = 4;
        one[1] = 3;
        one[2] = 7;
        System.out.println(finder(one));
        
    }
}
