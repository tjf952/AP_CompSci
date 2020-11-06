public class Card {
    private int suit;
    private int rank;
    //Creates string arrays for easy usage in the deck class
    final String[] ALL_SUIT = {"Clubs", "Diamonds", "Hearts", "Spades"};
    final String[] ALL_RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                               "Jack", "Queen", "King", "Ace" };
    //Creates card holder
    public Card(int mySuit, int myRank){
        suit = mySuit;
        rank = myRank;
    }
    // Methods to state rank and suit of card
    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }
    //Converts cards to string
    public String toString(){
        String answer = ALL_RANK[rank] + " of " + ALL_SUIT[suit];
        return answer;
    }
}