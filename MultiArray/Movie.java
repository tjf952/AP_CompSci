public class Movie
{
    public static double averageRatingByReviewer(int[][]ratings, int reviewerIndex){
        double sum = 0;
        double count = 0;
        for(int i = 0; i < ratings[0].length; ++i){
            sum += ratings[reviewerIndex][i];
            System.out.println("\tNew Sum: " + sum);
            count++;
        }
        double average = sum/count;
        return average;
    }
    public static int aboveX(int[][]ratings, int x){
        int count = 0;
        for(int i = 0; i < ratings.length; i++){
            for(int j = 0; j < ratings[i].length; j++){
                int num = ratings[i][j];
                if(num > x){
                    count++;
                    System.out.println("\tNew Count: " + count);
                }
            }
        }
        return count;
    }
    public static double averageRating(int[][]ratings, int movieIndex){
        double sum = 0;
        double count = 0;
        for(int i = 0; i < ratings.length; ++i){
            sum += ratings[i][movieIndex];
            count++;
            System.out.println("\tNew Sum: " + sum);
        }
        double average = sum/count;
        return average;
    }
    public static void main(String[]args){
        int[][]movies = {{4,6,2,5}, {7,9,4,8}, {6,9,3,7}};
        System.out.println("Critic Average: " + averageRatingByReviewer(movies,2));
        System.out.println("AboveX: " + aboveX(movies, 8));
        System.out.println("Average Rating: " + averageRating(movies, 1));
    }
}
