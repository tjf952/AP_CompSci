public class MonteCarlo
{
    private static double success = 0; // Successes
    private static double attempt = 1.0E7; // Amount of tries
    private static double up = 4; // y bound for grid
    private static double right = 4; // x bound for grid
    private static int counter = 0;
    public static boolean overUnder(double m, double b, double x, double y){
        double bound = m*x + b; // Gives y value of equation y = mx + b
        if(y <= bound){
            // Returns true if y value works
            success++;
            return true;
        }
        return false;
    }
    public static int tester(){
        // Tests each try
        while(counter < attempt){
            // Generates random points within grid
            double x = (double)(Math.random()*right);
            double y = (double)(Math.random()*up);
            // Checks possibilities of shape
            if(x < 1){
                overUnder(3, 0, x, y);
            }
            if(x >= 1 && x <= 3){
                overUnder(0, 3, x, y);
            }
            if(x > 3){
                overUnder(-3, 12, x, y);
            }
            counter++;
        }
        // Prints amount of success and attempts
        System.out.println("Success: " + success + "\nAttempts: " + attempt);
        // Prints ratio as a double
        double ratio = success / attempt;
        System.out.println("Ratio: " + ratio);
        // Returns a simplified integer to be printed as a percent
        return (int)(ratio*100);
    }
    public static void main(String[]args){
        System.out.println("Area: " + tester() + "%");
    }
}