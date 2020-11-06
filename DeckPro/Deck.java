import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Deck{
    ArrayList<Card> cards = new ArrayList<Card>();// Declares and creates arraylist of cards
    private final int MAX_CARDS = 52; // Maximum amount of cards in a deck
    private final int MAX_SUITS = 4; // Maximum suits possible
    private final int MAX_RANKS = 13; // Maximum ranks possible
    
    public Deck(){
        // Default constructor creates an empty deck (with no cards in it)
        this(0);
    }
    
    public Deck (int n){
        // Random generator needed to select cards for random to put in deck
        Random generator = new Random();
        // Calls to this constructor with values greater than 52 or less than 0
        if(n > MAX_CARDS || n < 0){
            n = MAX_CARDS;
            // Can't make a deck with more than 52 cards or less than 0
            System.out.println("Cards attempted invalid, therefore full deck made.");
        }
        // Adds n amount of cards to empty deck
        for(int i = 0; i < n; ++i){
            // Generates random suit and rank for card
            int suit = generator.nextInt(MAX_SUITS);
            int rank = generator.nextInt(MAX_RANKS);
            // Declares newCard 
            Card newCard = new Card(suit, rank);
            // Looks to see if a duplicate card is created when newCard is created
            if(findCard(suit, rank) == -1){
                // If not, then add that card
                cards.add(newCard);
            } else {
                // If so, then redo the process
                i--;
            }
        }
    }
    
    public void fullDeck(){
        // Creates full deck of cards
        for(int i = 0; i < MAX_SUITS; i++){
            for(int j = 0; j < MAX_RANKS; j++){
                Card nextCard = new Card(i, j);
                cards.add(nextCard);
            }
        } 
    }
    
    public int findCard(int cardSuit, int cardRank){
        // Returns index of card given in parameters.
        for(int i = 0; i < cards.size(); i++){
            Card newCard = cards.get(i);
            if(newCard.getRank() == cardRank && newCard.getSuit() == cardSuit){
                return i;
            }
        }
        // If card not found, returns -1;
        return -1;
    }
    
    public boolean addCard(int cardSuit, int cardRank){
        // Adds given card from parameter to the deck if it is not found in the deck
        if(findCard(cardSuit, cardRank) == -1){
            Card newCard = new Card(cardSuit, cardRank);
            cards.add(newCard);
            return true;
        } // If parameter is in in deck or not found, returns false and does nothing
        else {
            return false;
        }
    }

    public boolean removeCard(int cardSuit, int cardRank){
        // Removes given card from parameter from deck if found in the deck
        if(findCard(cardSuit, cardRank) != -1){
            cards.remove(findCard(cardSuit, cardRank));
            return true;
        }
        // If card is not found in deck, returns false and does nothing
        return false;
    }

    public boolean isFull(){  
        if(cards.size() == MAX_CARDS){
           return true;
        }
        return false;
    }

    public boolean isSorted(){ 
        boolean answer = false;
        for(int i = 0; i < cards.size()-1; i++){
            Card newCard = cards.get(i);
            Card newCard2 = cards.get(i+1);
            if(newCard.getSuit() <= newCard2.getSuit() && newCard.getRank() < newCard2.getRank()){
                answer = true;
            } else {
                answer = false;
            }
        }
        return answer;
    }
    
    public void sortDeck(){
        // Boolean made to know whether to keep sorting or stop sorting the cards
        boolean result = true;
        // Sets boolean to true, if true, it keeps sorting
        while(result == true){
            result = false;
            for(int i = 0; i < cards.size()-1; i++){
                // Creates two cards to represent the cards at the first and second index
                Card newCard = cards.get(i);
                Card newCard2 = cards.get(i+1);
                // Checks and sorts cards into suit groups, so that the increasing order is:
                // clubs, diamonds, hearts, spades
                if(newCard.getSuit() > newCard2.getSuit()){
                    cards.set(i, newCard2);
                    cards.set(i+1, newCard);
                    result = true;
                } else if(newCard.getSuit() == newCard2.getSuit()){
                    // Checks and sorts cards based on ranks in each group, so that its sorted 
                    // in increasing order: 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace 
                    if(newCard.getRank() > newCard2.getRank()){
                        cards.set(i, newCard2);
                        cards.set(i+1, newCard);
                        result = true;
                    }
                }
            }
        }
    }
    
    public void shuffleDeck(){
        // Uses collection class method shuffle(arraylist<>name)
        Collections.shuffle(cards);
    }
    
    public String toString(){
        // Prints cards in a string
        String result = "";
        // Adds each card to the string result
        for(Card nextCard: cards){
            result += "\n" + nextCard;
        }
        // If there are no cards, then "No Cards" stated
        if(cards.size() == 0){
            return "No Cards in Deck";
        }
        // States if full deck is printed
        if(cards.size() == MAX_CARDS){
            return "FULL DECK!" + result;
        }
        return result;
    }
} 
