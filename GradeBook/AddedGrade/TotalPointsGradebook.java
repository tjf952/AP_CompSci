/****************************************************
**
** TotalPointsGradebook class
**
** This class represents a Gradebook that calculates
** grades according to the total points grading system.
**
****************************************************/
import java.util.ArrayList;

// this class should implement the Gradebook interface
public class TotalPointsGradebook implements Gradebook// something is missing on this line
{
    double pointEarned = 0;
    double pointPossible = 0;
    private ArrayList<Assignment> myGrades;
    
    // TotalPointsGradebook constructor
    //
    // postcondition: myGrades is instantiated
    public TotalPointsGradebook() {
        myGrades = new ArrayList<Assignment>();
    }
    
    // add mutator method
    //
    // postcondition: the given Assignment object is added to myGrades
    public void add(Assignment assign) {
        myGrades.add(assign);
    }
    
    // calculateGrade accessor method
    //
    // postcondition: the grade represented by myGrades is calculated and
    // returned, according to the total points grading system. The value is
    // the sum of the points earned on all Assignments in this Gradebook, 
    // divided by the sum of the points possible on all Assignments in 
    // this Gradebook, and is converted to a value between 0 and 100, 
    // inclusive. 
    public double calculateGrade() {
        for(Assignment x: myGrades){
            pointEarned += x.getPointsEarned();
            pointPossible += x.getPointsPossible();
        }
        return (pointEarned/pointPossible)*100;
    }
}
