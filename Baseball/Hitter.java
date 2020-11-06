public abstract class Hitter extends BaseballPlayer
{
    int atBats;
    int hits;
    int RBI;
    int homeRuns;
    public Hitter(String myName, int myJersey, double myFielding, int myBats, int myHits, int myRBI, int myHRS){
        super(myName, myJersey, myFielding);
        atBats = myBats;
        hits = myHits;
        RBI = myRBI;
        homeRuns = myHRS;
    }
}
