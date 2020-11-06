public abstract class Pitcher extends BaseballPlayer
{
    int inningsPitched;
    double ERA;
    public Pitcher(String myName, int myJersey, double myFielding, int myInnings, double myERA){
        super(myName, myJersey, myFielding);
        inningsPitched = myInnings;
        ERA = myERA;
    }
}
