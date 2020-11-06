public class Cat{
    String name;
    int whiskerCount;
    // No arguments
    public Cat(){
        /* Wrong Way
        name = "none";
        whiskerCount = -1;
        */ 
        // Right Way, calls other constructor
        this("none", -1);
    }
    // Two arguments
    public Cat(String myName, int numOfWhiskers){
        name = myName;
        whiskerCount = numOfWhiskers;
    }
    
    public static void main(String[]args){
        Cat c = new Cat();
        System.out.println(c);
    }
    
    public String toString(){
        return "Name: " + name + "\nNumberOfWhiskers: " + whiskerCount;
    }
}
