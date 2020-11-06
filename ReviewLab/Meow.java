
public class Meow extends Animal
{
    String name;
    public Meow(String myName){
        name = myName;
    }
    public String speak(){
        String talk = "Meow";
        return talk;
    }
    public String toString(){
        return name;
    }
    public static boolean isTrue(Object c){
        if(c instanceof Meow){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Meow meow = new Meow("Bobby");
        System.out.println(meow + "" + meow.speak());
        System.out.println(isTrue(meow));
    }
}