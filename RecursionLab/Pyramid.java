public class Pyramid
{
    static String p1 = "";
    public static String pyramid(int counter){
        p1 += "*";
        System.out.println(p1);
        if(counter <= 1){
            return "";   
        }
        pyramid(counter - 1);
        p1 = p1.substring(0, p1.length()-1);
        System.out.print(p1);
        System.out.println();  
        return p1;
    }

    public static void main(String[] args) {
        pyramid(10);
    }
}