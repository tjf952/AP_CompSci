
public class StrayCat extends Meow
{
    public StrayCat(String myName){
        super(myName);
    }
    public static void main(String[]args){
        StrayCat meow = new StrayCat("Johnny");
        System.out.println(meow);
    }
}
