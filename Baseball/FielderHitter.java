public class FielderHitter extends Hitter
{
    //double fieldingPercentage;  
    public FielderHitter(String myName, int myJersey, double myFielding, int myBats, int myHits, int myRBI, int myHRS){
        super(myName, myJersey, myFielding, myBats, myHits, myRBI, myHRS);
    }
    public double getERA(){
        return -1;
    }
    public int getHits(){
        return hits;
    }
    public int getAtBats(){
        return atBats;
    }
    public int getHR(){
        return homeRuns;
    }
    public int getRBI(){
        return RBI;
    }
    public String toString(){
        return "FielderHitter: " + name + "\n\tJersey Number: #" + jerseyNumber + 
            "\n\tFielding Percentage: " + fieldingPercentage +
            "\n\tAt Bats: " + atBats + "\n\tHits: " + hits + 
            "\n\tRBI's: " + RBI + "\n\tHome Runs: " + homeRuns +"\n";
    }
}
