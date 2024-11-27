package two.collection.compare.test;

import java.util.*;

public class Deck {
    private static List<Card> deck = new ArrayList<>();
    private static Deque<Card> cardDeque;

    public static void start() {
        initCard();
        shuffleCard();
    }

    private static void initCard() {
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }

    public static void shuffleCard() {
        Collections.shuffle(deck);
        cardDeque = new ArrayDeque<>(deck);
    }

    public static Card popCard() {
        return cardDeque.pop();
    }

}
