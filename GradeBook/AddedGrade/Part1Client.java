/****************************************************
**
** Client class for Part 1
**
** This class is a Gradebook client, and is used
** to test the TotalPointsGradebook and Assignment
** classes.
**
** First, write a program that declares an Assignment 
** object, and then invokes all Assignment methods using
** that object. Print the return values to the screen, and
** verify that the Assignment class works properly. 
**
** Then, delete or comment out that code, and 
** write a program that declares a TotalPointsGradebook
** object, and adds Assignment objects to it. Then, 
** invoke the calculateGrade method on the TotalPointsGradebook
** object, and print the resulting value to the screen. 
**
** Do you have a class in school that uses the total
** points grading system, and in which you know your
** grades? You can use your own grades to test your
** TotalPointsGradebook and Assignment
** classes! Otherwise, you can use the following data:
**
** name         pts available         pts earned
** Lab 1        10                    9
** Lab 2        10                    10
** Lab 3        10                    8
** Lab 4        15                    13
** Quiz 1       5                     5
** Quiz 2       5                     4
** Quiz 3       5                     5
** Test 1       50                    46
** Test 2       50                    42
** Final Exam   50                    43
** 
** The grade printed should be approximately 88.095238
**
****************************************************/
public class Part1Client {
    public static void main(String[] args) {
        TotalPointsGradebook x = new TotalPointsGradebook();
        x.add(new Assignment("Lab", 10, 9));
        x.add(new Assignment("Lab", 10, 10));
        x.add(new Assignment("Lab", 10, 8));
        x.add(new Assignment("Lab", 15, 13));
        x.add(new Assignment("Quiz", 5, 5));
        x.add(new Assignment("Quiz", 5, 5));
        x.add(new Assignment("Quiz", 5, 4));
        x.add(new Assignment("Test", 50, 46));
        x.add(new Assignment("Test", 50, 42));
        x.add(new Assignment("Final", 50, 43));
        System.out.println(x.calculateGrade());
    }
}
