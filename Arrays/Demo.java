public class Demo
{
   public static void main(String[]args){
       int []z = new int[5];
       z[0] = 7;
       z[1] = 2;
       z[4] = 9;
       
       for (int i = 0; i < z.length; ++i){
            System.out.println(z[i]);
        }
      
       boolean x = isFound(z, 9);
       System.out.println("Boolean x is " + x);
       
       boolean y = isFound(z, 6);
       System.out.println("Boolean y is " + y);
   }
   public static boolean isFound(int []n, int target){
       for (int i = 0; i < n.length; ++i){
           if (n[i] == target) return true;
        }
       return false;
   }
}
