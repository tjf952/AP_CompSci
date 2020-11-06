import java.util.ArrayList;
public class Sort
{
    public static void minToFront(ArrayList<Integer>list){
        int max = 0;
        for(int i = 0; i < list.size() - 1; i++){
            max = list.get(i);
            if(max > list.get(i+1)){
                list.set(i,list.get(i+1));
                list.set(i+1,max);
            }
        }
    }
}
