import java.util.ArrayList;
/*
 * The ArrayList is a standard class in Java(like Strings)
 * The syntac of the Array List is as follows:
 *      ArrayList<Class> = new ArrayList<Class>(size);
 * Unlike arrays which are fixed sizes, ArrayLists can expand
 * Must use access methods such as:
 *      .add()  Adds class
 *      .remove()  Removes class
 *      .get()  Recieves class
 * ArrayLists can only hold objects
 */
public class ArrayListDemo
{
    public static void main(String[]args){
        //arraylist
        ArrayList<String> cart = new ArrayList<String>(1);
        
        cart.add("Shirt");
        cart.add("Shoes");
        cart.add("Pants");
        cart.set(1, "Socks"); //Replaces Shoes, only replace, not create 
        System.out.println(cart);
        System.out.println(cart.size());
        
        ArrayList<Double> price = new ArrayList<Double>(1);
        
        price.add(8.50);
        price.add(12.75);
        double d = 7.75;
        price.add(d);
        System.out.println(price);
        System.out.println(price.contains(7.75));
    }
}