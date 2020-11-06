public class DesignatedHitter extends Hitter
{
    public DesignatedHitter(String myName, int myJersey, double  myFielding, int myBats, int myHits, int myRBI, int myHRS){
        super(myName, myJersey, -1, myBats, myHits, myRBI, myHRS);
    }
    @Override
    public double getFielding(){
        return -1;
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
        return "DesignatedHitter: " + name + "\n\tJersey Number: #" + jerseyNumber + 
            "\n\tAt Bats: " + atBats + "\n\tHits: " + hits + 
            "\n\tRBI's: " + RBI + "\n\tHome Runs: " + homeRuns +"\n";
    }
}
