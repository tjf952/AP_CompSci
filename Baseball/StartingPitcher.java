public class StartingPitcher extends Pitcher
{
    public StartingPitcher(String myName, int myJersey, double myFielding, int myInnings, double myERA){
        super(myName, myJersey, myFielding, myInnings, myERA);
    }
    public double getERA(){
        return ERA;
    }
    public int getHits(){
        return -1;
    }
    public int getAtBats(){
        return -1;
    }
    public int getHR(){
        return -1;
    }
    public int getRBI(){
        return -1;
    }
    public String toString(){
        return "StartingPitcher: " + name + "\n\tJersey Number: #" + jerseyNumber + 
            "\n\tFielding Percentage: " + fieldingPercentage +
            "\n\tInnings Pitched: " + inningsPitched + "\n\tERA: " + ERA + "\n";
    }
}
