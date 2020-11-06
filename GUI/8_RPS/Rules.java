public class Rules{
    String r = "ROCK";
    String p = "PAPER";
    String s = "SCISSORS";
    String l = "LIZARD";
    String sp = "SPOCK";
    String win = "WIN";
    String lose = "LOSE";
    String tie = "TIE";

    public String getGameResult(String userChoice, String computerChoice){
        String x = userChoice;
        String y = computerChoice;
        String answer = "";
        
        // Determines winner
        if(x.equals(y)){
            answer = tie;
        }
        else if(x.equals(r)){
            if(y.equals(l) || y.equals(s)){
                answer = win;
            } else {
                answer = lose;
            }
        }
        else if(x.equals(p)){
            if(y.equals(r) || y.equals(sp)){
                answer = win;
            } else {
                answer = lose;
            }
        }
        else if(x.equals(s)){
            if(y.equals(l) || y.equals(p)){
                answer = win;
            } else {
                answer = lose;
            }
        }
        else if(x.equals(l)){
            if(y.equals(sp) || y.equals(p)){
                answer = win;
            } else {
                answer = lose;
            }
        }
        else if(x.equals(sp)){
            if(y.equals(s) || y.equals(r)){
                answer = win;
            } else {
                answer = lose;
            }
        }
        return answer;
    }

    public String getGameOutcome(String userChoice, String computerChoice){
        String x = userChoice;
        String y = computerChoice;
        String answer = "";
        
        // Determines winner
        if(x.equals(y)){
            answer = "It's a tie!";
        }
        else if(x.equals(r)){
            if(y.equals(l)){
                answer = "Rock crushes lizard!";
            }
            else if(y.equals(s)){
                answer = "Rock crushes scissors!";
            } 
            else{
                answer = "Rock loses";
            }
        }
        else if(x.equals(p)){
            if(y.equals(r)){
                answer = "Paper covers rock!";
            }
            else if(y.equals(sp)){
                answer = "Paper disproves spock!";
            } 
            else{
                answer = "Paper loses";
            }
        }
        else if(x.equals(s)){
            if(y.equals(p)){
                answer = "Scissors cuts paper!";
            }
            else if(y.equals(l)){
                answer = "Scissors decapitates lizard!";
            } 
            else{
                answer = "Scissors lose";
            }
        }
        else if(x.equals(l)){
            if(y.equals(sp)){
                answer = "Lizard poisons spock!";
            }
            else if(y.equals(p)){
                answer = "Lizard eats paper!";
            } 
            else{
                answer = "Lizard loses";
            }
        }
        else if(x.equals(sp)){
            if(y.equals(s)){
                answer = "Spock smashes scissors!";
            }
            else if(y.equals(r)){
                answer = "Spock vaporizes rock!";
            } 
            else{
                answer = "Spock loses";
            }
        }
        return answer;
    }
    
    public String getRandomChoice(){
        String[] choices = {r, p, s, l, sp};
        int rand = (int)(choices.length * Math.random());
        return choices[rand];
    }
}