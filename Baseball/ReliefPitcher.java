public class ReliefPitcher extends Pitcher
{
    int saves;
    public ReliefPitcher(String myName, int myJersey, double myFielding, int myInnings, double myERA, int mySaves){
        super(myName, myJersey, myFielding, myInnings, myERA);
        saves = mySaves;
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
        return "ReliefPitcher: " + name + "\n\tJersey Number: #" + jerseyNumber + 
            "\n\tFielding Percentage: " + fieldingPercentage +
            "\n\tInnings Pitched: " + inningsPitched + "\n\tERA: " + ERA +
            "%\n\tSaves: " + saves + "\n";
    }
}
