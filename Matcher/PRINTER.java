public class PRINTER{
    public static void main(String[]args){
        int counter = 0;
        int num;
        String str = "*";
        for(int i = 0; i < 20; i++){
            if(counter < 5){
                num = 0;
                while(num <= counter){
                    System.out.print(" ");
                    num++;
                }
                System.out.println(str);
                counter++;
            }
            if(counter == 10){
                counter = 0;
            }
            if(counter >= 5){
                num = counter - 5;
                while(num > 0){
                    System.out.print(" ");
                    num--;
                }
                System.out.println(str);
                counter++;
            }
        }
    }
}