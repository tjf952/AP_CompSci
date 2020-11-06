public class DeckRunner{
    public static void main(String[] args){
        // Creates a deck of 5 cards
        Deck  A = new Deck(5);
        System.out.println("Deck A: " + A + "\n");
        // Checks if the deck is sorted, should return false
        System.out.println("Deck A(sorted?): " + A.isSorted() + "\n");
        // Checks if it is a full deck, should return false
        System.out.println("Deck A(full?): " + A.isFull() + "\n");
        
        // Creates a deck of 100 cards, should default to 52, a full deck
        Deck B = new Deck(100);
        // Should sort deck
        B.sortDeck();
        System.out.println("Deck B(sorted): " + B + "\n");
        // Checks if the deck is sorted, should return true
        System.out.println("Deck B(sorted?): " + B.isSorted() + "\n");
        // Shuffles deck
        B.shuffleDeck();
        System.out.println("Deck B(shuffled): " + B + "\n");
        // Checks if the deck is full, should return true
        System.out.println("Deck B(full?): " + B.isFull() + "\n");
        // Gives the index of the asked card, Ace of Spades
        System.out.println("Deck B(indexOfAofS?): " + B.findCard(3, 12) + "\n");
        
        // Creates an empty deck
        Deck C = new Deck();
        System.out.println("Deck C: " + C + "\n");
        // Add the aces to the deck
        C.addCard(3, 12);
        C.addCard(2, 12);
        C.addCard(1, 12);
        C.addCard(0, 12);
        System.out.println("Deck C (afterAddedCards): " + C + "\n");
        // Removes two of them from the deck
        C.removeCard(0, 12);
        C.removeCard(2, 12);
        System.out.println("Deck C (afterRemovedCard): " + C + "\n");
    }
}