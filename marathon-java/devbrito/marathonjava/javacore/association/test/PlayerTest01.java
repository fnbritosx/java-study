package devbrito.marathonjava.javacore.association.test;

import devbrito.marathonjava.javacore.association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Lionel Messi");
        Player player02 = new Player("Cristiano Ronaldo");
        Player player03 = new Player("Neymar Jr");
        Player[] players = new Player[]{player01, player02, player03};

        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
}
