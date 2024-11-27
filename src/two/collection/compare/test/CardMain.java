package two.collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class CardMain {
    public static void main(String[] args) {

        Deck.start();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        player1.popCard();
        player2.popCard();

        System.out.println("player1.getMyDeck() = " + player1.getMyDeck());
        System.out.println("player2.getMyDeck() = " + player2.getMyDeck());

        System.out.println("player1.getSum() = " + player1.getSum());
        System.out.println("player2.getSum() = " + player2.getSum());
        Player winner = getWinner(player1, player2);
        System.out.println("winner = " + winner);

    }

    private static Player getWinner(Player p1, Player p2) {
        List<Player> players = new ArrayList<>(List.of(p1, p2));
        players.sort(null);
        return players.get(0);
    }
}
