import java.util.*;
/****************************************************
**
** CategoryGradebook class
**
** This class represents a CategoryGradebook that calculates
** grades according to the weighted category grading system.
**
****************************************************/
public class CategoryGradebook implements Gradebook2 {
    // declare any new instance variables that you need here
    // don't forget to make them private!
    // don't declare more that you really need!
    private ArrayList<CategoryAssignment> myGrades;
    private String[] categoryNames;
    private int[] categoryWeights;
    
    // precondition: categories.length == weights.length;
    // categories contains the names of all categories in this Gradebook;
    // weights contains the values of the weights of each corresponding category;
    // each value in weights is between 0 and 100 inclusive
    // postcondition: all instance variables are initialized;
    // if sum of elements in weights is not equal to 100, then the weight of
    // the last category is adjusted so that the sum is equal to 100
    public CategoryGradebook(String[] categories, int[] weights) {
        int sum = 0;
        myGrades = new ArrayList<CategoryAssignment>();
        categoryNames = categories;
        categoryWeights = weights;
        for(int myWeight: weights) {
            sum += myWeight;
        }
        if(sum > 100) {
            categoryWeights[categoryWeights.length-1] -= sum-100;
        } else if(sum < 100) {
            categoryWeights[categoryWeights.length-1] += 100-sum;
        }
    }
    // calculateGrade accessor method
    //
    // postcondition: the grade represented by this Gradebook is calculated and
    // returned, according to the weighted category grading system. To calculate this
    // value, first calculate the average of all assignments in each category. Then,
    // multiply each of those values with the value of the weight for that category.
    // Finally, add the values together. This value is between 0 and 100, inclusive.
    // 
    // If your task can be made easier by adding private helper methods to this class,
    // then be sure that they are thoroughly documented with comments. 
    
    public double calculateGrade() {
        double pointsEarned = 0;
        double pointsPossible = 0;
        double finalGrade = 0;
        for(String x: categoryNames){
            double categoryPoints = 0;
            for(CategoryAssignment cat: myGrades){
                if(cat.getCategoryName().equals(x)){
                    pointsEarned += cat.getPointsEarned();
                    pointsPossible += cat.getPointsPossible();
                }
                //System.out.println("PE:"+pointsEarned);
                //System.out.println("PP:"+pointsPossible);
            }
            categoryPoints = (pointsEarned/pointsPossible) * categoryWeights[getIndexNames(x)];;
            System.out.println("CP:" + categoryPoints);
            finalGrade += categoryPoints;
            System.out.println("FG:" + finalGrade);
            pointsEarned = 0;
            pointsPossible = 0;
        }
        System.out.println("FINAL GRADE:");
        return finalGrade;
    } 
    public int getIndexNames(String x) {
        int index = 0;
        for(int i = 0; i < categoryNames.length; i++){
            if(categoryNames[i].equals(x)){
                index = i;
            }
        }
        return index;
    }
    // add mutator method
    //
    // precondition: assign IS-A CategoryAssignment
    // postcondition: the given Assignment object is added to this Gradebook
    public void add(Assignment2 assign) {
        if(assign instanceof CategoryAssignment) {
            myGrades.add((CategoryAssignment)assign);
        }
    }
}
