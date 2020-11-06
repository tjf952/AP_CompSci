
public abstract class BaseballPlayer
{
    String name;
    int jerseyNumber;
    double fieldingPercentage;
    public BaseballPlayer(String myName, int myJersey, double myFielding){
        name = myName;
        jerseyNumber = myJersey;
        fieldingPercentage = myFielding;
    }
    public double getFielding(){
        return fieldingPercentage;
    }
    public abstract double getERA();
    public abstract int getHits();
    public abstract int getAtBats();
    public abstract int getHR();
    public abstract int getRBI();
}
