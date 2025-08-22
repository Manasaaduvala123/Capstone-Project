package day6_Assessment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.printDeck();
    }
}
enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;
}
enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
    EIGHT, NINE, TEN, JACK, QUEEN, KING;
}
class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String toString() {
        return rank + " of " + suit;
    }
}
class Deck {
    private final List<Card> cards = new ArrayList<>();
    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(cards);
    }
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}



