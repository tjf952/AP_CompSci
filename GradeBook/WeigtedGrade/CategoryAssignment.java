/****************************************************
**
** CategoryAssignment class
**
** This class represents an CategoryAssignment.
** Do not add any additional methods to this class.
**
****************************************************/
public class CategoryAssignment extends Assignment2
{
    private String categoryName;  
    // CategoryAssignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values.     
    public CategoryAssignment (String myName, double myPointsPossible, double myPointsEarned, String myCategoryName){
        super(myName, myPointsPossible, myPointsEarned);
        categoryName = myCategoryName;
    }
    
    // getCategoryName accessor method
    //
    // postcondition: returns the name of the category associated
    // with this CategoryAssignment
    public String getCategoryName() {
        return categoryName;
    }
}
