package two.collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player>{
    private String name;
    private List<Card> myDeck = new ArrayList<>();
    private int sum;

    public Player(String name) {
        this.name = name;
    }

    public void popCard() {
        for (int i = 0; i < 5; i++) {
            myDeck.add(Deck.popCard());
        }
        myDeck.sort(null);
    }

    public List<Card> getMyDeck() {
        return myDeck;
    }

    public int getSum() {
        for (Card card : myDeck) {
            sum += card.getRank();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", myDeck=" + myDeck +
                ", sum=" + sum +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.sum, o.sum) * -1;
    }
}
