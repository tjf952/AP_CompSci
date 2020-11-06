import java.util.*;
public class BaseballTeam
{
    private ArrayList<BaseballPlayer> team;
    public BaseballTeam(){
        team = new ArrayList<BaseballPlayer>();
    }
    public void addPlayer(BaseballPlayer newPlayer){
        team.add(newPlayer);
    }
    public double fieldingAverage(){
        double totalPercent = 0;
        int players = 0;
        for(BaseballPlayer nextPlayer: team){
            if(nextPlayer.getFielding() >= 0){
                totalPercent += nextPlayer.getFielding();
                players++;
            }
        }
        return totalPercent / players;
    }
    public double ERAaverage(){
        double totalERA = 0;
        int players = 0;
        for(BaseballPlayer nextPlayer: team){
            if(nextPlayer.getERA() >= 0){
                totalERA += nextPlayer.getERA();
                players++;
            }
        }
        return totalERA / players;
    }
    public double battingAverage(){
        int totalAtBats = 0;
        int totalHits = 0;
        for(BaseballPlayer nextPlayer: team){
            if(nextPlayer.getAtBats() >= 0){
                totalAtBats += nextPlayer.getAtBats();
                totalHits += nextPlayer.getHits();
            }
        }
        return ((double)totalHits)/totalAtBats;
    }
    public int HRAverage(){
        int totalHR = 0;
        int players = 0;
        for(BaseballPlayer nextPlayer: team){
            if(nextPlayer.getHR() >= 0){
                totalHR += nextPlayer.getHR();
                players++;
            }
        }
        return totalHR/players;
    }
    public int RBIAverage(){
        int totalRBI = 0;
        int players = 0;
        for(BaseballPlayer nextPlayer: team){
            if(nextPlayer.getRBI() >= 0){
                totalRBI += nextPlayer.getRBI();
                players++;
            }
        }
        return totalRBI/players;
    }
    public String toString(){
        return "Team Stats:\n\tFielding Average: " + fieldingAverage() +
            "\n\tERA Average: " + ERAaverage() +
            "\n\tBatting Average: " + battingAverage() +
            "\n\tHomeRun Average: " + HRAverage() +
            "\n\tRBI Average: " + RBIAverage() + "\n";
    }
}
