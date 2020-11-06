/****************************************************
**
** Assignment class
**
** This class represents an Assignment. 
**
****************************************************/
public class Assignment2 {
    private String name;          
    private double pointsPossible;
    private double pointsEarned;
    // Assignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values. 
    public Assignment2 (String myName, double myPointsPossible, double myPointsEarned) {
        name = myName;
        pointsPossible = myPointsPossible;
        pointsEarned = myPointsEarned;
    }
    
    // zero argument constructor - call the other one and set
    // name = "unknown", pointsPossible and pointsEarned to zero
    public Assignment2() {
        this("unknown", 0, 0);
    }
    
    // getName accessor method
    //
    // postcondition: returns the name of this Assignment
    public String getName() {
        return name;
    }
    
    // getPointsPossible accessor method
    //
    // postcondition: returns the points possible for this Assignment
    public double getPointsPossible() {
        return pointsPossible;
    }
    
    // getPointsEarned accessor method
    //
    // postcondition: returns the points earned for this Assignment
    public double getPointsEarned() {
        return pointsEarned;
    }
}
