
public class BaseballRunner
{
    public static void main(String[]args){
        // Starting: name, jersey, fielding%, innings, ERA 
        // Relief: name, jersey, fielding%, innings, ERA, saves
        // Designated: name, jersey, fielding%, bats, hits, RBI, HRs
        // Fielder: name, jersey, fielding%, bats, hits, RBI, HRs
        
        BaseballTeam Mets = new BaseballTeam();
        
        ReliefPitcher TF = new ReliefPitcher("TFinn",22,.9543,195,2.59,96);
        Mets.addPlayer(TF);
        StartingPitcher BC = new StartingPitcher("BColon",40,.5635,173,3.80);
        Mets.addPlayer(BC);
        FielderHitter DW = new FielderHitter("DWright",5,.9125,506,141,74,19);
        Mets.addPlayer(DW);
        // Negative number for universal "can't find"
        DesignatedHitter DM = new DesignatedHitter("DMurphy",28,-1,572,158,65,9);
        Mets.addPlayer(DM);
        
        System.out.println(DM);
        System.out.println(TF);
        System.out.println(DW);
        System.out.println(BC);
        System.out.println(Mets);
    }
}
