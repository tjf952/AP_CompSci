/**
We will do this project with a partner. If you do not know the rules of baseball, try to 
partner with someone who is a baseball fan. For this project, we will assume that our baseball
 team is in the American League such that the pitchers do not bat.

Your program should be able to generate output to calculate the following:

The profile for a ball player:
    Name
    Jersey Number
    All appropriate stats for that player
    
The profile for a team,
The average stats for the team including:
    Team ERA
    Team batting average
    Total HRs
    Total RBI
    etc.

Here are some examples of how baseball players can be created (constructed) 
in the runner class:

// StartingPitcher(String name, int jerseyNumber, int inningsPitched, double era,
 double fielding)
StartingPitcher tt = new StartingPitcher(“Terukazu  Tanaka”, 18, 27, 2.34, 0.975);

//FielderHitter(String name, int jerseyNumber, int atBats, int hits, int rbi,
 int hrs, double fielding)
FielderHitter dj = new FielderHitter(“Derek Jeter”, 2,  36, 12, 7, 5, 0.987);

Here is an example of how these players may be added to a newly-created team:

BaseballTeam yanks = new BaseballTeam(“Yankees”);
t.addPlayer(tt); // add tanaka
t.addPlayer(dj); // add jeter

Here is how we may query the statistics in the runner class:

System.out.println(dj); // should print all the info on derek jeter
System.out.println(yanks); // should print all the info on the yankees

    ERA (Pitchers): Is the mean of earnerd runs given up by a pitcher per nine innings 
        pitched. Means Earned Run Average... the lower the better... all time is 1.82
    
 */
public class Instructions{}