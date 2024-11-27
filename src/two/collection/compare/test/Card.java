package two.collection.compare.test;

public class Card implements Comparable<Card>{
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }

    @Override
    public int compareTo(Card another) {
        if (this.rank != another.rank) {
            return Integer.compare(this.rank, another.rank);
        } else {
            return this.suit.compareTo(another.suit);
        }
    }
}
