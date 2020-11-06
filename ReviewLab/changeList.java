import java.util.*;
public class changeList
{
    public static ArrayList<Integer> changer(ArrayList<Integer>list){
        int replacement = list.get(list.size()-1);
        list.set(list.size()-1,list.get(0));
        list.set(0, replacement);
        list.remove(list.size()/2);
        return list;
    }
    public static void main(String[]args){
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(2);
        System.out.println(changer(list));
    }
}
