import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[]args)
    {
        int[] randomArray;
        int[] numberArray = new int[10];
        
        randomArray = new int[20];
        randomArray[1] = 2;
        
        String[] stringArray = {"just", "random", "words"};
        System.out.println(stringArray);
            
        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = i;
            System.out.print(i + " x ");
        }
        System.out.println();
        
        int k = 1;
        while(k <= 41){
            System.out.print('-'); k++; 
        } 
        System.out.println();
          
        for(int j = 0; j < numberArray.length; j++){
            System.out.print("| " + j + " ");
        }
        System.out.println("|");
        
        String[][] multiArray = new String[10][10];
                
        for(int i = 0; i < multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = i + " " + j;
            }
        }
        
        k = 1;
        while(k <= 61){
            System.out.print('-'); k++; 
        } 
        System.out.println();
        
        for(int i = 0; i < multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++){
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println("|");
        }
        
        k = 1;
        while(k <= 61){
            System.out.print('-'); k++; 
        } 
        System.out.println();
        
        for(int row : numberArray){
            System.out.print(row);
        }
        System.out.println("\n");
        
        for(String[] rows : multiArray){
            for (String column : rows){
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }
        
        int[] numberCopy = Arrays.copyOf(numberArray, 5);
        
        for(int row : numberCopy){
            System.out.print(row);
        }
        System.out.println("\n");
        
        System.out.println(Arrays.toString(numberCopy));
        
        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers, 2);
        
        char[][] boardGame = new char[10][10];
        for(char[] row : boardGame){
            Arrays.fill(row, '*');
        }
        
        int[] numsToSort = new int[10];
        
        for(int i = 0; i < 10; i++){
            numsToSort[i] = (int)(Math.random() * 100);
        }
        
        Arrays.sort(numsToSort);
        System.out.println(Arrays.toString(numsToSort));
        int whereIs50 = Arrays.binarySearch(numsToSort, 50);
        System.out.println(whereIs50);
    }
}
